package com.study.patterns.structural.composite;

public class Client {

	public static void main(String[] args) {
		Shape tri = new Triangle();
		Shape tri1 = new Triangle();
		Shape cir = new Circle();
		
		Drawing drawing = new Drawing();
		drawing.add(tri);
		drawing.add(tri1);
		drawing.add(cir);
		
		drawing.draw("Red");
		
		System.out.println("*************");
		drawing.clear();
		System.out.println("*************");
		
		drawing.add(tri);
		drawing.add(cir);
		drawing.draw("Green");
	}	
	
}
