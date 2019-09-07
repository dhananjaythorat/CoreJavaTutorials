package com.study.patterns.strategy;

public class SparkExecutionStratey implements RuleExecutionStrategy {

	@Override
	public boolean execute(RulesExecutionInfo info) {
		System.out.println("RulesExecution submitted to spark.");
		return true;
	}

}