package com.study.patterns.creational.factory;

import com.study.patterns.behavioral.strategy.RuleExecutionStrategy;
import com.study.patterns.behavioral.strategy.RulesExecutionInfo;

public class Client {

	public static void main(String[] args) {

		RulesExecutionInfo info = new RulesExecutionInfo();
		info.setRunStrategy("JVM");
		
		RuleExecutionStrategy runStrategy = RuleExecutionStrategyFactory.getRuleExecutionStrategy(info);
		runStrategy.execute(info);
		
	}

}
