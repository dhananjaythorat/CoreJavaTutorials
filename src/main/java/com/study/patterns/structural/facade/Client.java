package com.study.patterns.structural.facade;

import com.study.patterns.behavioral.templatemethod.RuleInfo;

public class Client {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.execute(new RuleInfo());
	}

}
