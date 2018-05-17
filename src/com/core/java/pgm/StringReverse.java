package com.core.java.pgm;

public class StringReverse {
	public String reverse(String str) {
		String reverse = "";
		int length = str.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}
}
