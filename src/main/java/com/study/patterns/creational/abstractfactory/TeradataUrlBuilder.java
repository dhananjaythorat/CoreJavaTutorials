package com.study.patterns.creational.abstractfactory;

public class TeradataUrlBuilder extends UrlBuilder {

	@Override
	protected void build() {
		url = "jdbc:teradata//host:0000/dafault";
	}

}
