package com.study.patterns.memento;

public class Client {

	public static void main(String[] args) {

		RuleConfig ruleConfig = new RuleConfig("Number Compare");
		
		ruleConfig.save();
		
		System.out.println(" Original Value : "+ruleConfig.getRuleName());
		
		ruleConfig.setRuleName("Row Mismatch");
		
		System.out.println("\n New Value : "+ruleConfig.getRuleName());
		
		ruleConfig.undo();
		
		System.out.println("\n Restored original Value : "+ruleConfig.getRuleName());
	}

}
