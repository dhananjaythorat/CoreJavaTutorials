package com.study.patterns.behavioral.visitor;

public interface ExceptionElement {

	public String accept(ExceptionVisitor visitor);
	
} 