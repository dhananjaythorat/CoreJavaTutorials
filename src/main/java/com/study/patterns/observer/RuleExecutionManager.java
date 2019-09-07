package com.study.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class RuleExecutionManager {

	private List<RuleExecutionSubscriber> subscriberList = new ArrayList<>();
	
	public void subscribe(RuleExecutionSubscriber ruleExecutionSubscriber) {
		subscriberList.add(ruleExecutionSubscriber);
	}
	
	public void unSubscribe(RuleExecutionSubscriber ruleExecutionSubscriber) {
		subscriberList.remove(ruleExecutionSubscriber);
	}
	
	public void notifySubscribers(RuleInfo ruleInfo) {
		for(RuleExecutionSubscriber subscriber: subscriberList) {
			subscriber.update(ruleInfo);
		}
	}
	
}
