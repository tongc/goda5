package com.goda5.hagendaz.common.domain;

import javax.annotation.concurrent.NotThreadSafe;

/**
 * Synchronise putIfAbsent to make it thread safe.
 * @author tong
 *
 */
@NotThreadSafe
public class CustomMapService {
	private CustomMap<Integer, String> map = new CustomMap<Integer, String>();
	
	public void putIfAbsent(Integer key, String value) throws InterruptedException {
		if(map.containsKey(key)) {
			//Thread.sleep(100);
		} else {
			map.put(key, value);
		}
	}
	
	public void remove(Integer key) {
		map.remove(key);
	}
	
	public CustomMap<Integer, String> getMap() {
		return map;
	}
}
