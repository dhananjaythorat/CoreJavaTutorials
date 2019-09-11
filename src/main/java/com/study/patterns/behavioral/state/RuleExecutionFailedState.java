package com.study.patterns.behavioral.state;

public class RuleExecutionFailedState extends AbstractRuleExecutionState {

	public RuleExecutionFailedState (RuleExecutionStateContext context) {
		super(context);
	}
	
	@Override
	public void doAction() {
		System.out.println("Rule status FAILED.");
	}

}
