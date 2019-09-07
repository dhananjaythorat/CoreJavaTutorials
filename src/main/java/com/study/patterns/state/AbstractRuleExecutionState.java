package com.study.patterns.state;

public abstract class AbstractRuleExecutionState implements RuleExecutionState{

	RuleExecutionStateContext context;
	
	public AbstractRuleExecutionState(RuleExecutionStateContext context) {
		this.context = context;
	}
	
	public abstract void doAction();

}
