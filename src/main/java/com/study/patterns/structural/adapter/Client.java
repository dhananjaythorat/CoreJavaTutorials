package com.study.patterns.structural.adapter;

public class Client {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		
		Gallon gallon = new Gallon();
		gallon.setVolumeInGallon(2.25);
		
		GallonToLiterAdaptor gallonToLiterAdaptor = new GallonToLiterAdaptor(gallon);
		vehicle.fillTank(gallonToLiterAdaptor);
		
		System.out.println("**********************************");
		
		Liter ltr = new Liter();
		ltr.setVolumeInLiter(2.25);
		vehicle.fillTank(ltr);
	}

}
