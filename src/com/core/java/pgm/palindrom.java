package com.core.java.pgm;

public class palindrom {
public boolean isPalindrom(int num){
	int r,sum=0;
	int temp=num;
	while(num>0){
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;
	}
	if(temp==sum){
		return true;
		//System.out.println(temp+" is palindrom");
	}/*else {
		System.out.println(temp+" is not a palindrom");*/
	return false;
	}
}
