package com.core.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.core.java.pgm.Collection;

public class CollectionTest {
public static void main(String[] args) {
	Collection collect=new Collection();
	List<String> stringList=new ArrayList();
	List<Integer> intList=new ArrayList();
	stringList.add("ezra");
	stringList.add("mona");
	stringList.add("aria");
	System.out.println("before sorting");
	collect.displayusingEnhanced(stringList);
	Collections.sort(stringList);
	System.out.println("after sorting");
	collect.displayusingEnhanced(stringList);
	intList.add(94);
	intList.add(66);
	intList.add(88);
	System.out.println("before sorting");
	collect.displayusingIterator(intList);
	Collections.sort(intList);
	System.out.println("after sorting");
		collect.displayusingIterator(intList);
	collect.displayusingforloop(stringList);
	System.out.println(collect.search(stringList, "Mona"));
	System.out.println(collect.searchbyListPosition(intList, 66));
}
}
