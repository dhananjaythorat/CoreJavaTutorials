package com.study.patterns.behavioral.state;

public class Client {

	public static void main(String[] args) {
		
		RuleExecutionStateContext context = new RuleExecutionStateContext();
		
		RuleExecutionState state = RuleExecutionStateFactory.
				getRuleExecutionState(RuleExecutionStatus.SUBMITTED,context);


		context.setRuleExecutionState(state);
		
	}
	
}
