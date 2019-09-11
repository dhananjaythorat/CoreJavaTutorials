package com.study.patterns.behavioral.state;

public class RuleExecutionStateContext implements RuleExecutionState {

	private RuleExecutionState ruleExecutionState;
	
	@Override
	public void doAction() {
		ruleExecutionState.doAction();
	}

	public RuleExecutionState getRuleExecutionState() {
		return ruleExecutionState;
	}

	public void setRuleExecutionState(RuleExecutionState ruleExecutionState) {
		this.ruleExecutionState = ruleExecutionState;
		doAction();
	}

	
}
