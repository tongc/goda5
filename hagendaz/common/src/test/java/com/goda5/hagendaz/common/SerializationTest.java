package com.goda5.hagendaz.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.goda5.hagendaz.common.domain.User;

public class SerializationTest {
	Logger logger = LoggerFactory.getLogger(SerializationTest.class);
	private static final String USERNAME = "David";
	
	@Test
	public void testSerializeDeserializeUser() throws FileNotFoundException, IOException, ClassNotFoundException {
		User user = new User();
		user.setId(0L);
		user.setUsername(USERNAME);
		
		//Serialise
		File tempFile = File.createTempFile("temp", Long.toString(System.nanoTime()));
		FileOutputStream fos = new FileOutputStream(tempFile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(user);
		oos.close();
		
		logger.info(tempFile.getAbsolutePath());
		
		//De-serialise
		FileInputStream fis = new FileInputStream(tempFile);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		
		Assert.assertEquals(object.getClass(), User.class);
		Assert.assertEquals(((User)object).getUsername(), USERNAME);
		Assert.assertEquals(((User)object).getId(), new Long(0L));
		
		tempFile.delete();
	}
}
