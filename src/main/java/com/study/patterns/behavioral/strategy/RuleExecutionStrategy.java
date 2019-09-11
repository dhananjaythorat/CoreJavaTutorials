package com.study.patterns.behavioral.strategy;

public interface RuleExecutionStrategy {

	public boolean execute(RulesExecutionInfo info);
	
}
