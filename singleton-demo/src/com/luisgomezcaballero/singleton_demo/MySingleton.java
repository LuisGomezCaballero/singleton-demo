package com.luisgomezcaballero.singleton_demo;

public class MySingleton {

	private static MySingleton myInstance = null;

	private MySingleton() {
	}

	public static MySingleton getMyInstance() {
		if (myInstance == null) {
			return new MySingleton();
		} else {
			return myInstance;
		}
	}

	public String getString() {
		return "Hello World!";
	}
}
