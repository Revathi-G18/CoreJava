package com.core.java.pgm;

public class Lucky {
public int sum(int num){
	int sum=0;
	
	while(num>0){
	int r=num%10;
	sum=sum+r;
	num=num/10;
	if(sum>9 && num<1){
		num=sum;
		sum=0;
	}		
	}
	
	return sum;
}
}
