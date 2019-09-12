package com.study.patterns.creational.abstractfactory;

public class DatasourceFactory {

	public static AbstractDatasourceFactory getAbstractDatasourceFactory(String databaseType) {
		AbstractDatasourceFactory factory = null;
		switch(databaseType) {
			case "HIVE":
				factory = new HiveDatasourceFactory();
				break;
			case "TERADATA":
				factory = new TeradataDatasourceFactory();
				break;	
		}
		return factory;
	}
	
}
