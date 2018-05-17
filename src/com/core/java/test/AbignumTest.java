package com.core.java.test;

import java.util.Arrays;

import com.core.java.pgm.Abignum;

public class AbignumTest {
public static void main(String[] args) {
	int num[]={100,20,30,5,10};
	int num1[]={21,56,78,9};
	Abignum a=new Abignum();
	System.out.println("biggest number and its position : "+Arrays.toString(a.big(num)));
	System.out.println("sum of numbers in array: "+a.sum(num));
	System.out.println("merge two arrays: "+Arrays.toString(a.merge(num, num1)));
	System.out.println("insetion: "+Arrays.toString(a.insert(num, 66, 2)));
	System.out.println("deletion: "+Arrays.toString(a.deleteposition(num, 1)));
	System.out.println("deletion of number: "+Arrays.toString(a.deletenumber(num, 5)));
}
}
