package com.study.datastructure;

class HashMapCustom<K, V> {
	
	private LinkedList[] table = new LinkedList[10];

	public void put(K key, V value) {
		int index = Math.abs(key.hashCode() % table.length);
		
		if(table[index] == null) {
			table[index] = new LinkedList<K,V>();
		}
		
		table[index].add(key, value);
	}
	
	public V getValue(K key) {
		int index = Math.abs(key.hashCode() % table.length);
		LinkedList<K, V> tmp = table[index]; 
		return tmp.get(key);
	}
	
	private class LinkedList<K, V> {

		Node<K, V> head;
		Node<K, V> tail;
		
		private void add(K key,V value) {
			Node<K, V> tmp = tail;
			Node<K, V> element = new Node<K, V>();
			element.setKey(key);
			element.setValue(value);
			
			if(head == null) {
				head = element;
				tail = element;
			}else {
				if(tmp.getKey().equals(key)) {
					tmp.setValue(value);
				}else {
					tmp.setNextRef(element);
					tail = element;
				}
			}
		}
		
		private V get(K key) {
			Node<K, V> tmp = head;
			if(tmp.getKey().equals(key)){
				return tmp.getValue();
			}else {
				return get(key,tmp.getNextRef());
			}
		}
		
		private V get(K key,Node<K, V> next) {
			Node<K, V> tmp = next;
			if(tmp == null)
				return null;
			if(tmp.getKey().equals(key)){
				return tmp.getValue();
			}else {
				get(key,tmp.getNextRef());
			}
			return null;
		}
		
		private class Node<K, V> {
			private K key;
			private V value;
			private Node<K, V> nextRef;

			public K getKey() {
				return key;
			}

			public void setKey(K key) {
				this.key = key;
			}

			public V getValue() {
				return value;
			}

			public void setValue(V value) {
				this.value = value;
			}

			public Node<K, V> getNextRef() {
				return nextRef;
			}

			public void setNextRef(Node<K, V> nextRef) {
				this.nextRef = nextRef;
			}
		}

	}

	public static void main(String[] args) {
		HashMapCustom<String,String> m = new HashMapCustom<String, String>();
		
		m.put("thorat", "dhananjay");
		m.put("thorat", "ishvari");
		
		m.put("mane", "tejaswini");
		m.put("mane", "vinayak");
		
		m.put("smith", "tom");
		m.put("patil", "baba");
		
		System.out.println(m.getValue("thorat"));
		System.out.println(m.getValue("mane"));
		System.out.println(m.getValue("smith"));
		System.out.println(m.getValue("patil"));
	}

}
