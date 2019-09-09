package com.study.patterns.facade;

import com.study.patterns.templatemethod.RuleInfo;

public class Client {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.execute(new RuleInfo());
	}

}
