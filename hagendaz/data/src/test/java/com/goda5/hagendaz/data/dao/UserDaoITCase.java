package com.goda5.hagendaz.data.dao;

import java.awt.Button;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.goda5.hagendaz.common.domain.User;
import com.goda5.hagendaz.data.IntegrationTestBaseDao;

public class UserDaoITCase extends IntegrationTestBaseDao {
	@Inject
	private UserDao dao;

	private static final LocalDateTime DATETIME = new LocalDateTime();
	private static final String USER_NAME = "TEST";

	@BeforeClass
	public void ini() {
		logger.debug(DATETIME.toString());
	}

	@BeforeMethod
	public void init() {

	}

	@Test
	public void testSaveUser() {
		User user = new User();
		user.setUsername(USER_NAME);
		user.setRegDate(DATETIME);
		Assert.assertNull(user.getId());
		dao.save(user);
		Assert.assertNotNull(user.getId());
	}

	@Test
	public void testNetwork() throws UnknownHostException, IOException {
		ServerSocket serverSocket = new ServerSocket(4999);
		while(true) {
			Socket s = serverSocket.accept();
			PrintWriter out = new PrintWriter(s.getOutputStream(), true);
	        BufferedReader in = new BufferedReader(
	                    new InputStreamReader(
	                    s.getInputStream()));

	        String inputLine;
	        out.print("OK");
	        out.print("OK");
	        out.print("OK");
	        out.print("OK");
	        out.print("OK");
	        while ((inputLine = in.readLine()) != null) {
	        	System.out.println(inputLine);
	        }
		}
	}
}
