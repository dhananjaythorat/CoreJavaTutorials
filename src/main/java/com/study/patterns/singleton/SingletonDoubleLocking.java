package com.study.patterns.singleton;

public class SingletonDoubleLocking {
	
	private static SingletonDoubleLocking INSTANCE;
	
	private SingletonDoubleLocking() {
		
	}
	
	public static SingletonDoubleLocking getInstance() {
		if(INSTANCE == null) {
			synchronized(SingletonDoubleLocking.class) {
				if(INSTANCE == null) {
					INSTANCE = new SingletonDoubleLocking();
				}
			}
			
		}
		return INSTANCE;
	}

}
