package com.goda5.hagendaz.data.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.inject.Inject;

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
	public void testNetwork() throws UnknownHostException, IOException, InterruptedException {
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(new Runnable() {
			@Override
			public void run() {
				Socket s = null;
				try {
					Thread.sleep(1000);
					s = new Socket("localhost", 4999);
				} catch (UnknownHostException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				try {
					BufferedReader in = new BufferedReader(
		                    new InputStreamReader(
		                    s.getInputStream()));
			        boolean inputLine;
			        System.out.println("try read server");
			        while(inputLine = in.readLine()!=null) {
			        	System.out.println("value:" + inputLine);
			        }
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		
		ServerSocket serverSocket = new ServerSocket(4999);
		while(true) {
			System.out.println("waiting connection...");
			Socket s = serverSocket.accept();
			System.out.println("connected");
			PrintWriter out = new PrintWriter(s.getOutputStream(), true);
	        System.out.println("pumping to client");
	        Thread.sleep(1000);
	        out.print("OK");
	        out.print("OK");
	        out.print("OK");
	        out.print("OK");
	        out.print("OK");
	        break;
		}
		
		Thread.sleep(3000);
	}
}
