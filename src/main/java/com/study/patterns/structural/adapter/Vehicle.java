package com.study.patterns.structural.adapter;

public class Vehicle {

	private double gas;
	

	public double getGas() {
		return gas;
	}
	
	public void fillTank(Liter ltr) {
		gas = ltr.getVolumeInLiter();
		System.out.println(gas + " liter");
	}
	
}
