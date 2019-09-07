package com.study.patterns.templatemethod;

public class DQRuleExecutor extends RuleExecutorTemplateMethod {

	@Override
	public void runRules(RuleInfo ruleInfo) {
		System.out.println("DQ rules executed.");
	}

	@Override
	public void saveResults(RuleInfo ruleInfo) {
		System.out.println("Save DQ results.");
	}

}
