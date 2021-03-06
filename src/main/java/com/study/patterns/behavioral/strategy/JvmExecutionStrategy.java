package com.study.patterns.behavioral.strategy;

public class JvmExecutionStrategy implements RuleExecutionStrategy {

	@Override
	public boolean execute(RulesExecutionInfo info) {
		System.out.println("Rules executing on JVM in memory.");
		return true;
	}

}
