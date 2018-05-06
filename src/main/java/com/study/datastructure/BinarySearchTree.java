package com.study.datastructure;

public class BinarySearchTree<T> {

	private TreeNode<T> root = null;

	private void add(TreeNode<T> current, T item) {

		if ((Integer) item < (Integer) current.value) {
			if (current.left == null) {
				current.left = new TreeNode<T>();
				current.left.value = item;
			} else {
				add(current.left, item);
			}
		} else {
			if (current.right == null) {
				current.right = new TreeNode<T>();
				current.right.value = item;
			} else {
				add(current.right, item);
			}
		}

	}

	public void add(T item) {
		if (root == null) {
			TreeNode<T> newNode = new TreeNode<T>();
			newNode.value = item;
			root = newNode;
		} else {
			add(root, item);
		}
	}

	public void printInOrder() {
		printInOrder(root);
	}

	private void printInOrder(TreeNode<T> node) {

		if (node == null) {
			return;
		}

		printInOrder(node.left);
		System.out.print(node.value + ", ");
		printInOrder(node.right);

	}

	public void printPreOrder() {
		printPreOrder(root);
	}

	private void printPreOrder(TreeNode<T> node) {

		if (node == null) {
			return;
		}

		System.out.print(node.value + ", ");
		printPreOrder(node.left);
		printPreOrder(node.right);
	}

	public void printPostOrder() {
		printPostOrder(root);
	}

	private void printPostOrder(TreeNode<T> node) {

		if (node == null) {
			return;
		}
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(node.value + ", ");
	}

	
	@SuppressWarnings("hiding")
	private class TreeNode<T> {
		T value;
		TreeNode<T> left;
		TreeNode<T> right;
	}
	
	
	public static void main(String[] args) {

		BinarySearchTree<Integer> test = new BinarySearchTree<Integer>();
		test.add(4);
		test.add(2);
		test.add(3);
		test.add(1);
		test.add(6);
		test.add(5);
		test.add(7);

		test.printInOrder();

		System.out.println();
		System.out.println("****");

		test.printPreOrder();

		System.out.println();
		System.out.println("****");

		test.printPostOrder();

		System.out.println();
		System.out.println("****");

	}

}
