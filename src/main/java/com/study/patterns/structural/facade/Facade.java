package com.study.patterns.structural.facade;

import com.study.patterns.behavioral.strategy.RuleExecutionStrategy;
import com.study.patterns.behavioral.strategy.RuleExecutionStrategyFactory;
import com.study.patterns.behavioral.strategy.RulesExecutionInfo;
import com.study.patterns.behavioral.templatemethod.DQRuleExecutor;
import com.study.patterns.behavioral.templatemethod.RuleExecutorTemplateMethod;
import com.study.patterns.behavioral.templatemethod.RuleInfo;
import com.study.patterns.behavioral.templatemethod.TrendRuleExecutor;

public class Facade {

	public void execute(RuleInfo ruleInfo) {
		setRuleExecutionStrategy(ruleInfo);
		executeRules(ruleInfo);
	}
	
	private void setRuleExecutionStrategy(RuleInfo ruleInfo) {
		RulesExecutionInfo info = new RulesExecutionInfo();
		info.setRunStrategy("JVM");
		
		RuleExecutionStrategy runStrategy = RuleExecutionStrategyFactory.getRuleExecutionStrategy(info);
		runStrategy.execute(info);
	}
	
	private void executeRules(RuleInfo ruleInfo) {
		RuleExecutorTemplateMethod template = null;
		
		if(ruleInfo.reconRules.equals("Recon Rules")) {
			template = new TrendRuleExecutor();
			template.execute(new RuleInfo());
		}
		
		System.out.println();
		
		if(ruleInfo.dqRules.equals("Recon Rules")) {
			template = new DQRuleExecutor();
			template.execute(new RuleInfo());
		}
	}
}
