package com.goda5.hagendaz.common.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.backportconcurrent.ThreadPoolTaskExecutor;
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
