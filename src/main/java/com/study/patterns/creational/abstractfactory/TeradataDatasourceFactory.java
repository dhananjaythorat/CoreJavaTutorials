package com.study.patterns.creational.abstractfactory;

public class TeradataDatasourceFactory extends AbstractDatasourceFactory{

	@Override
	public DatasourceDAO getDatasourceDAO() {
		return new TeradataDatasourceDAO();
	}

	@Override
	public UrlBuilder getUrlBuilder() {
		return new TeradataUrlBuilder();
	}

}
