package com.study.sample;

public class Test {

	public static void main(String[] args) {

		String strBig = "one,two,three";
		String strShort = "one";
		
		String[] strBigArray = strBig.split(",");
		String[] strShortArray = strShort.split(",");
		
		for(String str:strBigArray) 
			System.out.println(str);
		
		for(String str:strShortArray)
			System.out.println(str);
	}

}
