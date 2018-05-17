package com.core.java.pgm;

public class CompareString {
public boolean compare(String x, String y){
	//is this variable required?
	boolean flag=false;
	//what is x and y?
	//calculate lenght before loop.
	if(x.length()==y.length()){
		for(int i=0;i<=x.length();i++){
			//check negetive condition first
			 if(x.charAt(i)==y.charAt(i)){
				 flag=true;
			 }return flag;
			}return flag;
	}
	return flag;
	//return x.equalsIgnoreCase(y);
}
}
