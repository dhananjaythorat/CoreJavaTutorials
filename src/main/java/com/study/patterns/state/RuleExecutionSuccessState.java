package com.study.patterns.state;

public class RuleExecutionSuccessState extends AbstractRuleExecutionState {

	public RuleExecutionSuccessState (RuleExecutionStateContext context) {
		super(context);
	}
	
	@Override
	public void doAction() {
		System.out.println("Rule status SUCCESS.");
	}

}
