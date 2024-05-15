package com.company.singleton_pattern.multi_thread_safe;

import com.company.singleton_pattern.SingletonSafe;

public class DemoMultiThreadSafe {
	public static void main(String[] args) {
		Thread threadFoo = new Thread(new ThreadFoo());
		Thread threadBar = new Thread(new ThreadBar());
		threadFoo.start();
		threadBar.start();
	}
	static class ThreadFoo implements Runnable {

		@Override
		public void run() {
			SingletonSafe singletonSafe = SingletonSafe.getInstance("FOO");
			System.out.println(singletonSafe.value);
		}
		
	}
	static class ThreadBar implements Runnable {

		@Override
		public void run() {
			SingletonSafe singletonSafe = SingletonSafe.getInstance("BAR");
			System.out.println(singletonSafe.value);
			
		}
		
	}
}
