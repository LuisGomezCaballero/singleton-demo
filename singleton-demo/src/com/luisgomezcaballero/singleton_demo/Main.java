package com.luisgomezcaballero.singleton_demo;

public class Main {

	public static void main(String[] args) {

		MySingleton mySingleton = MySingleton.getMyInstance();

		System.out.println(mySingleton.getString());
	}

}
