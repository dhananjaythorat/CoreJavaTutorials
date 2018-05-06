package com.study.datastructure;

public class QueueLinkList<T> {

	LinkedList<T> list = new LinkedList<T>();
	
	public void queue(T value) {
		list.add(value);
	}
	
	public T dqueue() {
		return list.remove();
	}
	
	public void print() {
		list.print();
	}
	
	private class LinkedList<T>{
		private Node<T> head;
		private Node<T> tail;
		
		public void add(T value) {
			Node<T> element = new Node<T>();
			element.setValue(value);
			Node<T> tmp = tail;
			if(head == null) {
				head = element;
				tail = element;
			}else {
				tmp.setNextRef(element);
				tail = element;
			}
		}
		
		public T get() {
			T result = head.getValue();
			return result;
		}
		
		public T remove() {
			T result = head.getValue();
			head = head.getNextRef();
			return result;
		}
		
		public void print() {
			if(head != null) {
				System.out.print(head.getValue());
				print(head.getNextRef());
			}
		}
		
		public void print(Node<T> next) {
			if(next != null) {
				System.out.print(" , "+next.getValue());
				print(next.getNextRef());
			}else {
				return;
			}
		}	
		
		private class Node<T>{
			private T value;
			private Node<T> nextRef;
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
		}//End Node class
	}//End LinkedList class
	
	public static void main(String[] args) {
		QueueLinkList<Integer> queue = new QueueLinkList<Integer>();
		
		queue.queue(10);
		queue.queue(20);
		queue.queue(30);
		queue.queue(40);
		
		queue.print();
		System.out.println("\n******");
		
		System.out.println(queue.dqueue());

		System.out.println("******");
		queue.print();
		System.out.println("\n******");
		
		System.out.println(queue.dqueue());

		System.out.println("******");
		queue.print();
		System.out.println("\n******");
		
		System.out.println(queue.dqueue());

		System.out.println("******");
		queue.print();
		System.out.println("\n******");
		
	}

}
