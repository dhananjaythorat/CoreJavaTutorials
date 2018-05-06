package com.study.datastructure;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StackLinkArray<T> {

	T[] values;
	int size = 0;

	@SuppressWarnings("unchecked")
	public void push(T item) {

		if (values == null || values.length == 0) {
			values = (T[]) Array.newInstance(item.getClass(), 2);
		}

		if (values.length == size) {
			int newLength = values.length * 2;
			T[] tmp = (T[]) Array.newInstance(item.getClass(), newLength);
			tmp = Arrays.copyOf(values, newLength);
			values = tmp;
		}

		values[size] = item;

		size++;

	}

	public T pop() {

		T item = values[size - 1];
		values[size - 1] = null;
		size--;

		return item;
	}

	public T peek() {
		T item = values[size - 1];

		return item;
	}

	public void print() {
		for (int i = values.length - 1; i >= 0; i--) {
			if (values[i] != null)
				System.out.println(values[i] + ", ");
		}
	}

	public static void main(String[] args) {

		StackLinkArray<Integer> test = new StackLinkArray<Integer>();
		test.push(1);
		test.push(2);
		test.push(3);

		test.print();

		System.out.println();
		System.out.println("****");

		test.pop();

		test.print();
		System.out.println();
		System.out.println("****");

		System.out.println(test.peek());

	}

}
