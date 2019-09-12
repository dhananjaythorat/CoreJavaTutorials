package com.study.patterns.creational.abstractfactory;

public class HiveDatasourceFactory extends AbstractDatasourceFactory{

	@Override
	public DatasourceDAO getDatasourceDAO() {
		return new HiveDatasourceDAO();
	}

	@Override
	public UrlBuilder getUrlBuilder() {
		return new HiveUrlBuilder();
	}

}
