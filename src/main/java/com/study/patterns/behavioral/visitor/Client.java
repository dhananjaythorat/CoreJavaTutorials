package com.study.patterns.behavioral.visitor;

public class Client {

	public static void main(String[] args) {

		ReconException rc = new ReconException();
		DQException dq = new DQException();
		
		ExceptionVisitor json = new JsonExceptionVisitor();
		System.out.println(rc.accept(json));
		System.out.println(dq.accept(json));
		
		System.out.println();
		
		ExceptionVisitor xml = new XmlExceptionVisitor();
		System.out.println(rc.accept(xml));
		System.out.println(dq.accept(xml));
		
	}

}
