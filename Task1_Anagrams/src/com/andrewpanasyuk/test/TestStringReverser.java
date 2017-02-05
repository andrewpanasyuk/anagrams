package com.andrewpanasyuk.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.andrewpanasyuk.anagrams.StringReverser;

public class TestStringReverser {
	StringReverser stringReverser = new StringReverser();

	@Test
	public void testReverse1() {
		assertEquals("dcba", stringReverser.reverse("abcd"));
	}

	@Test
	public void testReverse2() {
		assertEquals("dcba dcBa", stringReverser.reverse("abcd aBcd"));
	}

	@Test
	public void testReverse3() {
		assertEquals("dcb*a", stringReverser.reverse("abc*d"));
	}

	@Test
	public void testReverse4() {
		assertEquals("dcb123*a,", stringReverser.reverse("abc123*d,"));
	}

	@Test
	public void testReverse5() {
		assertEquals("d1cba", stringReverser.reverse("a1bcd"));
	}

	@Test
	public void testReverse6() {
		assertEquals("123456", stringReverser.reverse("123456"));
	}

	@Test
	public void testReverse7() {
		assertEquals("/*-+", stringReverser.reverse("/*-+"));
	}

	@Test
	public void testReverse8() {
		assertEquals("abcABC123/*-+", stringReverser.reverse("CBAcba123/*-+"));
	}

}
