package com.core.java.pgm;

import java.util.Iterator;
import java.util.List;

public class Collection {
public void displayusingEnhanced(List list)
{
	for(Object o:list){
		System.out.println(o);
	}
}
public void displayusingIterator(List list)
{
	Iterator it=list.iterator();
	if(it.hasNext()){
		System.out.println(it.next());
	}
}
public void displayusingforloop(List list){
	for(int i=0;i<list.size();i++){
		System.out.println(i);
	}
}
public int searchbyListPosition(List<Integer> list,int i){
	int index=list.indexOf(i);
	for(Integer List:list)
	if(index==i){
		return 0;
	}
	return  index;
	}
public boolean search(List<String> list, String str){
	for(String s:list){
		if(s.equalsIgnoreCase(str)){
			return true;
		}
	}return false;
}
public boolean search(List<Integer> list, int num){
	for(int number:list){
		if(number==num){
			return true;
		}
	}return false;
}
}
