package com.goda5.hagendaz.common;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class MSRTests {
	public static void main(String[] args) throws IOException {
		new MSRTests().testReadMSR();
	}
	
	public void testReadMSR() throws IOException {
		RandomAccessFile file = new RandomAccessFile("/dev/cpu/0/msr", "rw");
		FileChannel fc = file.getChannel();
		ByteBuffer bb = ByteBuffer.allocate( 1024 * 15 );
		fc.read(bb);
		System.out.println(bb.getLong());
		file.close();
	}
}
