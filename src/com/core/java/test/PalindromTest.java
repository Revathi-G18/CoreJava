package com.core.java.test;

import com.core.java.pgm.PalindromString;
import com.core.java.pgm.palindrom;

public class PalindromTest {
	public static void main(String[] args) {
		palindrom pal=new palindrom();
		System.out.println( pal.isPalindrom(1331));
		PalindromString ps=new PalindromString();
		System.out.println(ps.isStringPalindrom("hellh"));
	}
 
}
