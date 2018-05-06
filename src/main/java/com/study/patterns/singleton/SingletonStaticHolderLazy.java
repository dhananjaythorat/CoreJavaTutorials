package com.study.patterns.singleton;

public class SingletonStaticHolderLazy {
	
	private SingletonStaticHolderLazy() {		
	}
	
	private static class LazyHolder{
		private static final SingletonStaticHolderLazy INSTANCE = new SingletonStaticHolderLazy();
	}
	
	public static  SingletonStaticHolderLazy getInstance() {
		return LazyHolder.INSTANCE;
	}

}
