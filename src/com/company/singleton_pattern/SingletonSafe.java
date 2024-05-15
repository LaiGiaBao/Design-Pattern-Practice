package com.company.singleton_pattern;

public class SingletonSafe {
	private static volatile SingletonSafe instance;
	public String value;
	private SingletonSafe(String value) {
		this.value = value;
	}
	public static SingletonSafe getInstance(String value) {
		SingletonSafe result = instance;
		if (result != null) {
			return result;
		}
		synchronized(SingletonSafe.class) {
			if (instance == null) {
				instance = new SingletonSafe(value);
			}
			return instance;
		}
	}
}
