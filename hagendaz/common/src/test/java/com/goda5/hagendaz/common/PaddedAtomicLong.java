package com.goda5.hagendaz.common;

import java.util.concurrent.atomic.AtomicLong;

@SuppressWarnings("serial")
public class PaddedAtomicLong extends AtomicLong {
	public PaddedAtomicLong() {
	}

	public PaddedAtomicLong(final long initialValue) {
		super(initialValue);
	}

	public volatile long p1, p2, p3, p4, p5, p6 = 7;
}