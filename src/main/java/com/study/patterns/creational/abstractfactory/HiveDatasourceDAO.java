package com.study.patterns.creational.abstractfactory;

public class HiveDatasourceDAO extends DatasourceDAO{

	@Override
	public String getTableList() {
		return "Hive table list";
	}

}
