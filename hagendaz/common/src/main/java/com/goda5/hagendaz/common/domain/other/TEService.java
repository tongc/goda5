package com.goda5.hagendaz.common.domain.other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

@Service
public class TEService {
	@Autowired
	private ThreadPoolTaskExecutor te;
	
	public void ttt() {
		te.execute(new Runnable() {
			@Override
			public void run() {
				
			}
		});
		te.shutdown();
	}
}
