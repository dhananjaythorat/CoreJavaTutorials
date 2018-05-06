package com.study.datastructure;

public class LinkedListDouble<T> {

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
			current.setPreRef(tmp);
			tmp.setNextRef(current);
			tail = current;
		}
		
	}
	
	public void remove(T item) {
		
		Node<T> tmp = head;
				
		while(true) {
			if(tmp.getValue() == item) {
				
				if(tmp.getNextRef() != null)
				tmp.getNextRef().setPreRef(tmp.getPreRef());
				
				if(tmp.getPreRef() != null)
				tmp.getPreRef().setNextRef(tmp.getNextRef());
				
				if(tmp == tail)
					tail = tmp.getPreRef();
				
				if(tmp == head)
					head = tmp.getNextRef();
					
				
				break;
			}
			tmp = tmp.getNextRef();
		}
		
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
		Node<T> preRef;
		Node<T> nextRef;
		
		public T getValue() {
			return value;
		}
		public void setValue(T value) {
			this.value = value;
		}
		public Node<T> getPreRef() {
			return preRef;
		}
		public void setPreRef(Node<T> preRef) {
			this.preRef = preRef;
		}
		public Node<T> getNextRef() {
			return nextRef;
		}
		public void setNextRef(Node<T> nextRef) {
			this.nextRef = nextRef;
		}
	}
	
	public static void main(String[] args) {

		LinkedListDouble<Integer> test = new LinkedListDouble<Integer> ();
		test.add(10);
		test.add(20);
		test.add(30);
		test.add(40);
		test.add(50);
		test.add(60);
		test.add(70);
		
		test.print();
		
		System.out.println();
		System.out.println("****");
		
		
		test.remove(10);
		test.remove(20);		
		test.remove(60);
		test.remove(70);
		
		test.print();
		
		
	}

}

