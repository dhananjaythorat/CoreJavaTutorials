package com.study.patterns.creational.singleton;

public class SingletonStaticHolderEarly {
	
	private static SingletonStaticHolderEarly INSTANCE = new SingletonStaticHolderEarly();
	
	private SingletonStaticHolderEarly() {
		
	}
	
	public static  SingletonStaticHolderEarly getInstance() {
		return INSTANCE;
	}

}
