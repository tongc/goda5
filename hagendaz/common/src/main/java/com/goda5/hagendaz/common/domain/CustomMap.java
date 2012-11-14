package com.goda5.hagendaz.common.domain;

import java.util.HashMap;

public class CustomMap<TK, TV> extends HashMap<TK, TV> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public TV put(TK k, TV v) {
		if(this.containsKey(k)) {
			System.out.println("yeah...................................." + System.currentTimeMillis());
			//throw new RuntimeException("Ilegal");
		}
		return super.put(k, v);
	}
}
