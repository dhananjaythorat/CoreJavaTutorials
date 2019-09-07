package com.study.patterns.visitor;

public interface ExceptionElement {

	public String accept(ExceptionVisitor visitor);
	
} 