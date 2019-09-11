package com.study.patterns.behavioral.strategy;

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
