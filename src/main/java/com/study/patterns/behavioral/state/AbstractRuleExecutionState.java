package com.study.patterns.behavioral.state;

public abstract class AbstractRuleExecutionState implements RuleExecutionState{

	RuleExecutionStateContext context;
	
	public AbstractRuleExecutionState(RuleExecutionStateContext context) {
		this.context = context;
	}
	
	public abstract void doAction();

}
