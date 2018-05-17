package com.core.java.pgm;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Count {
/*public int count(String s){
	char[] ch = s.toCharArray();
	int count=0;
	for(int i=0;ch[i]!='\0';i++){
		count++;
	}return count;
}*/
public int countwords(String s){
	int count=1;
	int length=s.length();
	for(int i=0;i<length;i++){
		if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
			count++;
		}
	}return count;
}
public int[] caseCheck(String s){
	int lower=0,upper=0;
	int length=s.length();
	for(int i=0;i<length;i++){
		if(Character.isLowerCase(s.charAt(i))){
			lower++;
		}else if(Character.isUpperCase(s.charAt(i))){
			upper++;
		}
	}return new int[]{lower,upper};		
}

public int countchar(String s, char c){
	int count=0;
	int length=s.length();
	for(int i=0;i<length;i++){
		if(s.charAt(i)==c){
			count++;
		}
	}return count;
}

public Map countallchar(String s){
	int length=s.length();
	Map map=new HashMap();
	for(int i=0;i<length;i++){
		if(map.get(s.charAt(i))==null){
			map.put(s.charAt(i), 1);
		}else{
			int c=(int) map.get(s.charAt(i));
			map.put(s.charAt(i), c+1);
		}
	}return map;
}
}
