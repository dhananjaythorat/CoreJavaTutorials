package com.study.datastructure;

public class StackLinkList<T> {

	StackLInkedList<T> stackHolder = new StackLInkedList<T>();

	public void push(T item) {
		stackHolder.addFirst(item);
	}

	public T pop() {
		return stackHolder.removeTop();
	}

	public T peek() {
		return stackHolder.getTop();
	}

	public void print() {
		stackHolder.print();
	}

	private class StackLInkedList<T> {

		Node<T> head;
		Node<T> tail;

		public void addFirst(T item) {

			Node<T> current = new Node<T>();
			current.setValue(item);

			Node<T> tmp = head;

			if (head == null) {
				head = current;
				tail = current;
			} else {
				head = current;
				head.setNextRef(tmp);
			}

		}

		public T removeTop() {
			Node<T> tmp = head.getNextRef();
			Node<T> top = head;
			head = tmp;
			return top.getValue();
		}

		public T getTop() {
			return head.getValue();
		}

		public void print() {

			Node<T> tmp = head;

			while (true) {
				if (tmp == null)
					break;

				System.out.print(tmp.getValue() + ", ");

				tmp = tmp.getNextRef();
			}

		}

		private class Node<T> {

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

	}

	public static void main(String[] args) {

		StackLinkList<Integer> test = new StackLinkList<Integer>();
		test.push(1);
		test.push(2);
		test.push(3);

		test.print();

		System.out.println();
		System.out.println("****");

		System.out.println(test.pop());
		System.out.println();
		System.out.println("****");
		
		test.print();
		System.out.println();
		System.out.println("****");

		System.out.println(test.peek());

	}

}
