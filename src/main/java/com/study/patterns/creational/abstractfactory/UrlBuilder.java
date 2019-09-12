package com.study.patterns.creational.abstractfactory;

public abstract class UrlBuilder {

	protected String url;
	
	public String getUrl(){
		build();
		return url;
	}
	
	protected abstract void build();
	
}
