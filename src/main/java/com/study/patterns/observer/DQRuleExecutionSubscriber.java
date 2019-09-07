package com.study.patterns.observer;

public class DQRuleExecutionSubscriber implements RuleExecutionSubscriber {

	@Override
	public void update(RuleInfo ruleInfo) {
		System.out.println(ruleInfo.dqRules + " executed.");
	}

}
