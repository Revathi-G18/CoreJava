package com.core.java.pgm;

public class PalindromString {
public boolean isStringPalindrom(String s){
	//why reverse variable?
	//String reverse="";
	int length=s.length();
	for(int i=0;i<length/2;i++){
	if(s.charAt(i)!=s.charAt(s.length()-i-1)){
		return false;
	}}
		return true;
	
	/*for(int i=length-1;i>=0;i--){
		reverse = reverse+s.charAt(i);
		}
	if(s.equals(reverse)){
		System.out.println(s+"is palindrom");
	}
	else {System.out.println(s+" is not a palindrom");
}*/
}
}
