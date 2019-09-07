package com.study.patterns.templatemethod;

public class Client {

	public static void main(String[] args) {
		RuleExecutorTemplateMethod template = new TrendRuleExecutor();
		template.execute(new RuleInfo());
		System.out.println();
		template = new DQRuleExecutor();
		template.execute(new RuleInfo());
	}
}
