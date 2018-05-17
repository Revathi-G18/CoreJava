package com.core.java.test;

import java.util.Arrays;

import com.core.java.pgm.Count;

public class CountTest {
public static void main(String[] args) {
	Count co=new Count();
	System.out.println("Number of words in the sentence 'hello world !!! ))' : "+co.countwords("hello world !!! ))"));
	int caseCheck[]=co.caseCheck("LEOnardODicapRIo");
	System.out.println("LowerCase and UpperCase Count in 'LEOnardODicapRIo': "+Arrays.toString(caseCheck));
	System.out.println("Occurance of a in String 'EzzraFitzzz': "+co.countchar("EzzraFitzzz", 'a'));
	
}
}
