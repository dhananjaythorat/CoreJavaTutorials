package com.study.patterns.observer;

//Spark Side
public class Client {

	public static void main(String[] args) {

		RuleExecutionManager manager = new RuleExecutionManager();
		manager.subscribe(new ReconRuleExecutionSubscriber());
		manager.subscribe(new DQRuleExecutionSubscriber());
		
		RuleInfo ruleInfo = new RuleInfo();
		
		manager.notifySubscribers(ruleInfo);
	}

}
