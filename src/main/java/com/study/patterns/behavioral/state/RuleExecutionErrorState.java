package com.study.patterns.behavioral.state;

public class RuleExecutionErrorState extends AbstractRuleExecutionState {

	public RuleExecutionErrorState (RuleExecutionStateContext context) {
		super(context);
	}
	
	@Override
	public void doAction() {
		System.out.println("Rule status ERROR.");
	}

}
