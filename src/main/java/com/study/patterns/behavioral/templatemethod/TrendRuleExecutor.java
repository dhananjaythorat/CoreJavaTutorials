package com.study.patterns.behavioral.templatemethod;

public class TrendRuleExecutor extends RuleExecutorTemplateMethod {

	@Override
	public void runRules(RuleInfo ruleInfo) {
		System.out.println("Trend rules executed.");
	}

	@Override
	public void saveResults(RuleInfo ruleInfo) {
		System.out.println("Save Trend results.");
	}

}
