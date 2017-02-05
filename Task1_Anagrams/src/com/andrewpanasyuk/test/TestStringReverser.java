package com.andrewpanasyuk.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.andrewpanasyuk.anagrams.StringReverser;

public class TestStringReverser {

	@Test
	public void testReverse() {
		StringReverser stringReverser = new StringReverser();
		String rezult = stringReverser.reverse("abcd abc*d a1bcd");
		assertEquals(rezult, "dcba dcb*a d1cba");
	}

}
