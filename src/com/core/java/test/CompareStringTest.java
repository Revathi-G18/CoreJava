package com.core.java.test;

import com.core.java.pgm.CompareString;

public class CompareStringTest {
public static void main(String[] args) {
	String str1="hello";
	String str2="hello";
	CompareString compare=new CompareString();
	System.out.println(compare.compare(str1,str2));
}
}
