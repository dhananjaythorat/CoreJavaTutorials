package com.study.algorithms.sort;

public class SelectionSort {
	
	private static void sort(int[] array) {
		int length = array.length;
		for(int i=0;i<length-1;i++) {
			int minIndex = i;
			for(int j=i+1;j<length;j++) {
				if(array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			swap(i,minIndex,array);
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
