package com.study.patterns.state;

public class RuleExecutionRunningState extends AbstractRuleExecutionState {

	public RuleExecutionRunningState (RuleExecutionStateContext context) {
		super(context);
	}
	
	@Override
	public void doAction() {
		System.out.println("Rule status RUNNING. : check oozie status");
		context.setRuleExecutionState(RuleExecutionStateFactory.
				getRuleExecutionState(RuleExecutionStatus.SUCCESS,context));
	}

}
