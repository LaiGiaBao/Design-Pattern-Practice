package com.company.singleton_pattern.single_thread;

public class DemoSingleThread {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance("FOO");
		Singleton singleton2 = Singleton.getInstance("BAR");
		System.out.println(singleton.value);
		System.out.println(singleton2.value);
	}
}
