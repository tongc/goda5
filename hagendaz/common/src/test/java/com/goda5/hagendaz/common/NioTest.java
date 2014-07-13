package com.goda5.hagendaz.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.nio.file.Path;

import org.junit.Test;

public class NioTest {
	//@Test
	public void testPath() {
		Path p = new File("C:/Users/v626284/dev/temp/test.txt").toPath();
		File f = new File("resources/common.xml");
		System.out.println(f.toPath().toString());
		System.out.println(p.resolveSibling("test.xxx"));
		System.out.println(p.resolve(f.toPath()));
	}
	
	
	
	@Test
	public void testChannelRead() throws IOException, InterruptedException {
		File f = new File("C:/Users/v626284/dev/temp/tempfile.txt");
		for(int i=0;i<100;i++) {
			System.out.println(f.length());
			Thread.sleep(500);
		}
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos = new FileOutputStream(f);
		FileLock l =  null;
		try {
			l = fos.getChannel().lock();
			for(int i=0;i<9000010;i++) {
				fos.write(("testtesttesttesttesttesttesttesttesttesttesttest" + i).getBytes());
			}
		} finally {
			fos.close();
			l.release();
		}
	}
}
