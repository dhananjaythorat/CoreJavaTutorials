package com.study.patterns.creational.factory;

import com.study.patterns.behavioral.strategy.JvmExecutionStrategy;
import com.study.patterns.behavioral.strategy.RuleExecutionStrategy;
import com.study.patterns.behavioral.strategy.RulesExecutionInfo;
import com.study.patterns.behavioral.strategy.SparkExecutionStratey;

public class RuleExecutionStrategyFactory {

	public static RuleExecutionStrategy getRuleExecutionStrategy (RulesExecutionInfo info) {
		RuleExecutionStrategy strategy = null;
		switch(info.getRunStrategy()) {
			case "SPARK":
				strategy = new SparkExecutionStratey();
				break;
			case "JVM":
				strategy = new JvmExecutionStrategy();
				break;
		}		
		return strategy;
	}
	
}
