package com.study.patterns.creational.abstractfactory;

public class TeradataDatasourceDAO extends DatasourceDAO{

	@Override
	public String getTableList() {
		return "Teradata table list";
	}

}
