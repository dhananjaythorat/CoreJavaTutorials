package com.study.datastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestLinkedListSingle {

	LinkedListSingle<Integer> test;
	
	@BeforeEach
	void setUp() throws Exception {
		test = new LinkedListSingle<Integer> ();
		test.add(1);
		test.add(2);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		test.add(3);
		assertEquals(test.contains(3),true);
	}

	@Test
	void testRemove() {
		assertEquals(test.contains(2),true);
		test.remove(2);
		assertEquals(test.contains(2),false);
	}

	@Test
	void testContains() {
		assertEquals(test.contains(1),true);
		assertEquals(test.contains(2),true);
	}

}
