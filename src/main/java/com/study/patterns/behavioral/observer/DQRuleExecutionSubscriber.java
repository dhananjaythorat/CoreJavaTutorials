package com.study.patterns.behavioral.observer;

public class DQRuleExecutionSubscriber implements RuleExecutionSubscriber {

	@Override
	public void update(RuleInfo ruleInfo) {
		System.out.println(ruleInfo.dqRules + " executed.");
	}

}
