/*
 * MIT License
 * Copyright © 2020 Swiss AviationSoftware Ltd.
 */
package com.swissas.coding.interview.data;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerArrayTest {
	
	@Test
	public void test123Plus1() {
		// given
		int[] number = { 1, 2, 3 };
		// when
		int[] result = new IntegerArray().addOne(number);
		// then result is [ 1, 2, 4 ]
		assertEquals(3, result.length);
		assertEquals(1, result[0]);
		assertEquals(2, result[1]);
		assertEquals(4, result[2]);
	}

	@Test
	public void test99Plus11() {
		// given
		int[] n1 = { 9, 9 };
		int[] n2 = { 1, 1 };
		// when
		int[] result = new IntegerArray().add(n1, n2);
		// then result is [ 1, 1, 0 ]
		assertEquals(3, result.length);
		assertEquals(1, result[0]);
		assertEquals(1, result[1]);
		assertEquals(0, result[2]);
	}

}
