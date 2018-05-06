package com.study.algorithms.sort;

public class BubbleSort {

	
	private static void sort(int[] array) {
		int length = array.length;
		for(int i=0;i<length;i++) {
			for(int j=0;j<length-1;j++) {
				int k = j+1;
				if(array[j] > array[k]) {
					swap(j,k,array);
				}
			}
		}
		print(array);
	}
	
	
	private static void swap(int j, int k, int[] array) {
		int tmp = array[j];
		array[j] = array[k];
		array[k] = tmp;
	}
	
	private static void print(int[] array) {
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+", ");
	}
	
	public static void main(String[] args) {
		int[] input = {5,3,19,17,0,1,33,55,1};
		sort(input);
	}

}
