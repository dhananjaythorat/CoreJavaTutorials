package com.study.patterns.observer;

public class ReconRuleExecutionSubscriber implements RuleExecutionSubscriber {

	@Override
	public void update(RuleInfo ruleInfo) {
		System.out.println(ruleInfo.reconRules + " executed.");
	}

}
