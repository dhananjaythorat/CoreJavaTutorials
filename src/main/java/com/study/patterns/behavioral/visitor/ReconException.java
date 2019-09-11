package com.study.patterns.behavioral.visitor;

public class ReconException implements ExceptionElement {

	private String reconRuleName = "Number compare";
	
	public String getReconRuleName() {
		return reconRuleName;
	}

	public void setReconRuleName(String reconRuleName) {
		this.reconRuleName = reconRuleName;
	}

	@Override
	public String accept(ExceptionVisitor visitor) {
		return visitor.visit(this);
	}

}
