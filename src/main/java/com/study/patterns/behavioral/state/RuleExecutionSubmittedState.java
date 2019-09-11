package com.study.patterns.behavioral.state;

public class RuleExecutionSubmittedState extends AbstractRuleExecutionState {

	public RuleExecutionSubmittedState (RuleExecutionStateContext context) {
		super(context);
	}
	
	@Override
	public void doAction() {
		System.out.println("Rule status SUBMITTED : submit to oozie : check oozie status");
		if(true)
			context.setRuleExecutionState(RuleExecutionStateFactory.
				getRuleExecutionState(RuleExecutionStatus.RUNNING,context));
		else
			context.setRuleExecutionState(RuleExecutionStateFactory.
					getRuleExecutionState(RuleExecutionStatus.FAILED,context));
	}

}
