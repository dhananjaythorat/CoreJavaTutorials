package com.study.patterns.behavioral.visitor;

public class XmlExceptionVisitor implements ExceptionVisitor {

	@Override
	public String visit(ReconException reconException) {
		return "<"+reconException.getReconRuleName()+">";
	}

	@Override
	public String visit(DQException dqException) {
		return  "<"+dqException.getDqRuleName()+">";
	}

}
