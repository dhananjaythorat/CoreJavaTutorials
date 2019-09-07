package com.study.patterns.state;

public class RuleExecutionStateFactory {

	public static RuleExecutionState getRuleExecutionState(RuleExecutionStatus status,
			RuleExecutionStateContext context) {
		
		RuleExecutionState ruleExecutionState = null;
		
		switch(status) {
			case SUBMITTED:
				ruleExecutionState 	= new  RuleExecutionSubmittedState(context);
				break;
			case RUNNING:
				ruleExecutionState 	= new  RuleExecutionRunningState(context);
				break;
			case SUCCESS:
				ruleExecutionState 	= new  RuleExecutionSuccessState(context);
				break;
			case FAILED:
				ruleExecutionState 	= new  RuleExecutionFailedState(context);
				break;
			case ERROR:
				ruleExecutionState 	= new  RuleExecutionErrorState(context);
				break;				
		}
		
		return ruleExecutionState;
		
	}
	
}
