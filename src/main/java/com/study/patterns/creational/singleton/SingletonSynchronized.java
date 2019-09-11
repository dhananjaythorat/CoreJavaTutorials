package com.study.patterns.creational.singleton;

public class SingletonSynchronized {
	
	private static SingletonSynchronized INSTANCE;
	
	private SingletonSynchronized() {
		
	}
	
	public static synchronized  SingletonSynchronized getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new SingletonSynchronized();
		}
		return INSTANCE;
	}

}
