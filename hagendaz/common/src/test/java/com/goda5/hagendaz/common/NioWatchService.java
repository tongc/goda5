package com.goda5.hagendaz.common;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.WatchEvent.Kind;

public class NioWatchService {
	public static void watchDirectoryPath(Path path) {
		// Sanity check - Check if path is a folder
		try {
			Boolean isFolder = (Boolean) Files.getAttribute(path,
					"basic:isDirectory", LinkOption.NOFOLLOW_LINKS);
			if (!isFolder) {
				throw new IllegalArgumentException("Path: " + path + " is not a folder");
			}
		} catch (IOException ioe) {
			// Folder does not exists
			ioe.printStackTrace();
		}
		
		System.out.println("Watching path: " + path);
		
		// We obtain the file system of the Path
		FileSystem fs = path.getFileSystem ();
		
		// We create the new WatchService using the new try() block
		try(WatchService service = fs.newWatchService()) {
			
			// We register the path to the service
			// We watch for creation events
			path.register(service, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
			
			// Start the infinite polling loop
			WatchKey key = null;
			while(true) {
				key = service.take();
				
				// Dequeueing events
				Kind<?> kind = null;
				for(WatchEvent<?> watchEvent : key.pollEvents()) {
					// Get the type of the event
					kind = watchEvent.kind();
					if (StandardWatchEventKinds.OVERFLOW == kind) {
						continue; //loop
					} else {
						// A new Path was created 
						Path newPath = ((WatchEvent<Path>) watchEvent).context();
						// Output
						System.out.println("operation on " + newPath);
					}
				}
				
				if(!key.reset()) {
					break; //loop
				}
			}
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
    	Path monitorPath = Paths.get("C:\\Users\\v626284\\Downloads");
    	watchDirectoryPath(monitorPath);
//    	try (final WatchService watchService = FileSystems.getDefault().newWatchService()) {
//	        monitorPath.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE);
//	        while(true) {
//	        	final WatchKey key = watchService.take();
//	        	if(key==null) continue;
//	        	for (WatchEvent<?> watchEvent : key.pollEvents()) {
//	        		final Kind<?> kind = watchEvent.kind();
//	        		if (StandardWatchEventKinds.OVERFLOW == kind) {
//	        			continue; // loop
//	        		}
//	        		System.out.println(watchEvent);
//	        	}
//	        }
//    	}
	}
}
