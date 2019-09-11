package com.study.patterns.behavioral.visitor;

public interface ExceptionVisitor {

	public String visit(ReconException reconException);
	public String visit(DQException dqException);
	
}
