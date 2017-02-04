package com.andrewpanasyuk.anagrams;

import java.util.Scanner;

public class StringReverser {
	public static void main(String[] args) {
		StringReverser stringReverser = new StringReverser();
		Scanner in = new Scanner(System.in);
		String inputLine;
		while ((inputLine = in.nextLine()).length() > 0) {
			System.out.println(stringReverser.reverse(inputLine));
		}
	}
	
	public String reverse(String string) {
		String result = "";
		while (string.contains(" ")) {
			result = result
					+ turnString(string.substring(0,
							string.indexOf(" "))) + " ";
			string = string.substring(string.indexOf(" ") + 1);
		}
		return result + turnString(string);
	}

	private String turnString(String s) {
		char[] incomingChars = s.toCharArray();
		char[] resultChars = new char[incomingChars.length];
		int lastIndex = resultChars.length - 1;
		for (int i = 0; i < incomingChars.length; i++) {
			for (int a = incomingChars.length - 1; a >= 0; a--) {
				if (Character.isLetter(incomingChars[i])) {
					if (Character.isLetter(incomingChars[lastIndex])) {
						resultChars[lastIndex] = incomingChars[i];
						lastIndex--;
						break;
					} else {
						lastIndex--;
					}
				} else {
					resultChars[i] = incomingChars[i];
				}
			}
		}
		return new String(resultChars);
	}
	
	

	
}
