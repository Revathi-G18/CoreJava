package com.core.java.test;

import java.util.Arrays;

import com.core.java.pgm.Search;

public class SearchTest {
public static void main(String[] args) {
	int num[]={30,80,54,43,5,3};
	Search sobj=new Search();
	System.out.println(sobj.linearsearch(30, num));
	System.out.println(sobj.binarysearch(54, num));
	System.out.println("bubble sort: "+Arrays.toString(sobj.bubble(num)));
	System.out.println("selection sort: "+Arrays.toString(sobj.selection(num)));
	System.out.println("merge sort: "+Arrays.toString(sobj.merge(num)));
}
}
