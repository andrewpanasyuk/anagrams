package com.andrewpanasyuk.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.andrewpanasyuk.anagrams.StringReverser;

public class TestStringReverser {

	@Test
	public void testReverse() {
		StringReverser stringReverser = new StringReverser();
		assertEquals("dcba", stringReverser.reverse("abcd"));
		assertEquals("dcba dcBa", stringReverser.reverse("abcd aBcd"));
		assertEquals("dcb*a", stringReverser.reverse("abc*d"));
		assertEquals("dcb123*a,", stringReverser.reverse("abc123*d,"));
		assertEquals("d1cba", stringReverser.reverse("a1bcd"));
		assertEquals("הדגבא", stringReverser.reverse("אבגדה"));
		assertEquals("123456", stringReverser.reverse("123456"));
		assertEquals("/*-+", stringReverser.reverse("/*-+"));
		assertEquals("ְֱֲגבא123CBAcba/*-+", stringReverser.reverse("abcABC123אבגְֱֲ/*-+"));
		
	}

}
