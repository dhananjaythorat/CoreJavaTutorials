package com.study.patterns.behavioral.visitor;

public class DQException implements ExceptionElement {
	
	private String dqRuleName = "must be numric";

	
	public String getDqRuleName() {
		return dqRuleName;
	}



	public void setDqRuleName(String dqRuleName) {
		this.dqRuleName = dqRuleName;
	}



	@Override
	public String accept(ExceptionVisitor visitor) {
		return visitor.visit(this);
	}

}
