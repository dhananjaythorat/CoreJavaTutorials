package com.study.patterns.structural.adapter;

public class GallonToLiterAdaptor extends Liter {

	private Gallon gallon;
	
	public GallonToLiterAdaptor(Gallon gallon) {
		this.gallon = gallon;
	}
	
	@Override
	public double getVolumeInLiter() {
		return 3.78541 * gallon.getVolumeInGallon();
	}
	
}
