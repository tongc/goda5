package com.goda5.hagendaz.common;

import java.io.File;
import java.nio.file.Path;

import org.junit.Test;

public class NioTest {
	@Test
	public void testPath() {
		Path p = new File("C:/Users/v626284/dev/temp/test.txt").toPath();
		File f = new File("resources/common.xml");
		System.out.println(f.toPath().toString());
		System.out.println(p.resolveSibling("test.xxx"));
		System.out.println(p.resolve(f.toPath()));
	}
}
