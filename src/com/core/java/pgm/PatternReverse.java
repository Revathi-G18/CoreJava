package com.core.java.pgm;

public class PatternReverse {
public void show(int r){
	int i,j;
	for(i=r;i>=1;i--){
		for(j=1;j<i;j++){
			System.out.print(j);
		}	System.out.println();
	}
}
public void display(int r){
	int i,j;
	for(i=r;i>=1;i--){
		for(j=1;j<i;j++){
			System.out.print(i);
		}	System.out.println();
	}
}
public void showrev(int r){
	int i,j,k;
	for(i=1;i<=r;i++){
		for(k=0;k<r-i;k++){
			System.out.print("  ");}
		for(j=1;j<=i;j++)
			System.out.print(j+" ");
			System.out.println("");
	}
}


}
