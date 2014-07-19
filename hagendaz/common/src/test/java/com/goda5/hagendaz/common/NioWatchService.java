package com.goda5.hagendaz.common;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.WatchEvent.Kind;

public class NioWatchService {
	public static void watchDirectoryPath(Path path) {
		System.out.println("Watching path: " + path);
		FileSystem fs = path.getFileSystem ();
		try(WatchService service = fs.newWatchService()) {
			path.register(service, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
			WatchKey key = null;
			while(true) {
				key = service.take();
				Kind<?> kind = null;
				for(WatchEvent<?> watchEvent : key.pollEvents()) {
					kind = watchEvent.kind();
					if (StandardWatchEventKinds.OVERFLOW == kind) {
						continue;
					} else {
						Path newPath = ((WatchEvent<Path>) watchEvent).context();
						System.out.println("operation kind " + kind + " path " + newPath);
					}
				}
				if(!key.reset()) {
					break;
				}
			}
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
    	Path monitorPath = Paths.get("/home/tong/Downloads");
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
