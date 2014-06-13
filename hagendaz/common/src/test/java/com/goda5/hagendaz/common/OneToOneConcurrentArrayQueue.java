package com.goda5.hagendaz.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class OneToOneConcurrentArrayQueue<E> implements java.util.Queue<E> {
	public static void main1(String[] args) throws InterruptedException {
		final OneToOneConcurrentArrayQueue q = new OneToOneConcurrentArrayQueue(100000);
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				q.offer("test");
				//System.out.println(q.tail);
			}
		};
		ExecutorService s = Executors.newFixedThreadPool(200);
		for(int i=0;i<10000;i++) {
			s.execute(r);
		}
		s.shutdown();
		s.awaitTermination(30, TimeUnit.SECONDS);
		System.out.println(q.tail);
	}
	
	public static void main(String[] args) throws InterruptedException {
		final ConcurrentLinkedQueue q = new ConcurrentLinkedQueue();
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				q.offer("test");
			}
		};
		ExecutorService s = Executors.newFixedThreadPool(200);
		for(int i=0;i<10000;i++) {
			s.execute(r);
		}
		s.shutdown();
		s.awaitTermination(30, TimeUnit.SECONDS);
		System.out.println(q.size());
	}
	
	private final E[] buffer;

	private volatile long tail = 0;
	private volatile long head = 0;

	public OneToOneConcurrentArrayQueue(int capacity) {
		buffer = (E[]) new Object[capacity];
	}

	public boolean offer(final E e) {
		final long currentTail = tail;
		final long wrapPoint = currentTail - buffer.length;
		if (head <= wrapPoint) {
			return false;
		}

		buffer[(int) (currentTail % buffer.length)] = e;

		tail = currentTail + 1;
		//System.out.println(tail);
		return true;
	}

	public E poll() {
		final long currentHead = head;
		if (currentHead >= tail) {
			return null;
		}

		final int index = (int) (currentHead % buffer.length);
		final E e = buffer[index];
		buffer[index] = null;

		head = currentHead + 1;

		return e;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}
}
