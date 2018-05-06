package com.study.datastructure;

public class LinkedListSingle<T> {

	Node<T> head;
	Node<T> tail;
	
	public void add(T item) {
		
		Node<T> current = new Node<T>();
		current.setValue(item);
		
		Node<T> tmp = tail;
		
		if(head == null) {
			head = current;
			tail = current;
		}else {
			tmp.setNextRef(current);
			tail = current;
		}
		
	}
	

	public void remove(T item) {
		
		Node<T> tmp = head;
		Node<T> previous = head;
		
		while(true) {
			if(tmp.getValue() == item) {
				
				if(tmp == head)
					head = tmp.getNextRef();
				else
					previous.setNextRef(tmp.getNextRef());
				
				break;
			}
			previous = tmp;
			tmp = tmp.getNextRef();
		}
		
	}	
	
	public T get(T item) {
		
		Node<T> tmp = head;
		T result;
		
		while(true) {
			if(tmp.getValue().equals(item) ) {
				result = tmp.getValue();
				break;
			}else {
				tmp = tmp.getNextRef();
			}
		}
		
		return result;
	}
	
	public boolean contains(T item) {
		
		Node<T> tmp = head;
		boolean result = false;
		
		while(true) {
			if(tmp==null) break;
			if(tmp.getValue().equals(item) ) {
				result = true;
				break;
			}else {
				tmp = tmp.getNextRef();
			}
		}
		
		return result;
	}
	
	public void print() {
		
		Node<T> tmp = head;
		
		while(true) {
			if(tmp == null)
				break;
			
			System.out.print(tmp.getValue() + ", ");
			
			tmp = tmp.getNextRef();
		}
		
	}
	
	private class Node<T>{
		
		T value;
		Node<T> nextRef;
		
		public T getValue() {
			return value;
		}
		public void setValue(T value) {
			this.value = value;
		}
		public Node<T> getNextRef() {
			return nextRef;
		}
		public void setNextRef(Node<T> nextRef) {
			this.nextRef = nextRef;
		}
	}
	
	public static void main(String[] args) {

		LinkedListSingle<Integer> test = new LinkedListSingle<Integer> ();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		
		test.print();
		
		System.out.println();
		System.out.println("****");
		
		
		test.remove(1);
		test.remove(2);		
		test.remove(6);
		test.remove(7);
		
		test.print();
		
		
	}

}

