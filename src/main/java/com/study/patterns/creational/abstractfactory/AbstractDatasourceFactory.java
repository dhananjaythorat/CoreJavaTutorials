package com.study.patterns.creational.abstractfactory;

public abstract class AbstractDatasourceFactory {
	
	public abstract DatasourceDAO getDatasourceDAO();

	public abstract UrlBuilder getUrlBuilder();
	
}
