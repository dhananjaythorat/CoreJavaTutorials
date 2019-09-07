package com.study.patterns.templatemethod;

public abstract class RuleExecutorTemplateMethod {

	public void execute(RuleInfo ruleInfo) {
		validateInput(ruleInfo);
		getDataset(ruleInfo);
		runRules(ruleInfo);
		saveResults(ruleInfo);
	}
	
	public void validateInput(RuleInfo ruleInfo) {
		System.out.println("Validating input data");
	}
	
	public void getDataset(RuleInfo ruleInfo) {
		System.out.println("Get dataset");
	}
	
	public abstract void runRules(RuleInfo ruleInfo);
	
	public abstract void saveResults(RuleInfo ruleInfo);
}
