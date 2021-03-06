package com.study.patterns.behavioral.strategy;

import com.study.patterns.creational.factory.RuleExecutionStrategyFactory;

public class Client {

	public static void main(String[] args) {

		RulesExecutionInfo info = new RulesExecutionInfo();
		info.setRunStrategy("JVM");
		
		RuleExecutionStrategy runStrategy = RuleExecutionStrategyFactory.getRuleExecutionStrategy(info);
		runStrategy.execute(info);
		
	}

}