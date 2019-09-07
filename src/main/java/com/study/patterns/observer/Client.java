package com.study.patterns.observer;

public class Client {

	public static void main(String[] args) {

		RuleExecutionManager manager = new RuleExecutionManager();
		manager.subscribe(new ReconRuleExecutionSubscriber());
		manager.subscribe(new DQRuleExecutionSubscriber());
		
		RuleInfo ruleInfo = new RuleInfo();
		
		manager.notifySubscribers(ruleInfo);
	}

}
