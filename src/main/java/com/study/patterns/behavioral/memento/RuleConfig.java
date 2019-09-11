package com.study.patterns.behavioral.memento;

public class RuleConfig {

	public RuleConfig() {}
	
	public RuleConfig(String ruleName) {this.ruleName = ruleName;}
	
	Memento memento = null;
	
	private String ruleName;

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	
	public void save(){
		this.memento = new Memento(this);
	}
	
	public void undo() {
		this.ruleName = memento.ruleName;
	}
	
	private class Memento{
		private String ruleName;
		private Memento(RuleConfig ruleConfig) {
			this.ruleName = ruleConfig.ruleName;
		}
	}
	
}
