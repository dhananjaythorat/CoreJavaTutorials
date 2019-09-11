package com.study.patterns.behavioral.observer;

public class ReconRuleExecutionSubscriber implements RuleExecutionSubscriber {

	@Override
	public void update(RuleInfo ruleInfo) {
		System.out.println(ruleInfo.reconRules + " executed.");
	}

}
