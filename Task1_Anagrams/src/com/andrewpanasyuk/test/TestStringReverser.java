package com.andrewpanasyuk.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.andrewpanasyuk.anagrams.StringReverser;

public class TestStringReverser {
	final StringReverser stringReverser = new StringReverser();
	private String expected;
	private String actual;

	@Test
	public void testReverse1() {
		expected = "dcba";
		actual = stringReverser.reverse("abcd");
		assertEquals(expected, actual);
	}

	@Test
	public void testReverse2() {
		expected = "dcba dcBa";
		actual = stringReverser.reverse("abcd aBcd");
		assertEquals(expected, actual);
	}

	@Test
	public void testReverse3() {
		expected = "dcb*a";
		actual = stringReverser.reverse("abc*d");
		assertEquals(expected, actual);
	}

	@Test
	public void testReverse4() {
		expected = "dcb123*a,";
		actual = stringReverser.reverse("abc123*d,");
		assertEquals(expected, actual);
	}

	@Test
	public void testReverse5() {
		expected = "d1cba";
		actual = stringReverser.reverse("a1bcd");
		assertEquals(expected, actual);
	}

	@Test
	public void testReverse6() {
		expected = "123456";
		actual = stringReverser.reverse("123456");
		assertEquals(expected, actual);
	}

	@Test
	public void testReverse7() {
		expected = "/*-+";
		actual = stringReverser.reverse("/*-+");
		assertEquals(expected, actual);
	}

	@Test
	public void testReverse8() {
		expected = "abcABC123/*-+";
		actual = stringReverser.reverse("CBAcba123/*-+");
		assertEquals(expected, actual);
	}

}
