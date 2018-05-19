package com.core.java.pgm;

public class Natural {
public int[] display(){
	int arr[]=new int[10];
	for(int i=1;i<=10;i++){
		arr[i-1]=i;
	}
	return arr;
}
}
