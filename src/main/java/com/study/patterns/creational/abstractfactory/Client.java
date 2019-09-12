package com.study.patterns.creational.abstractfactory;

public class Client {

	public static void main(String[] args) {

		AbstractDatasourceFactory factory = DatasourceFactory.getAbstractDatasourceFactory("TERADATA");
		
		System.out.println(factory.getDatasourceDAO().getTableList());
		System.out.println(factory.getUrlBuilder().getUrl());
		
	}

}
