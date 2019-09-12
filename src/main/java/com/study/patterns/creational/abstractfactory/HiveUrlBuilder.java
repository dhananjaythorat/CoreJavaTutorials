package com.study.patterns.creational.abstractfactory;

public class HiveUrlBuilder extends UrlBuilder {


	@Override
	protected void build() {
		url = "jdbc:hive//host:8790/dafault";
	}

}
