package com.core.java.pgm;

public class Pattern {
public void show(int r){
	int i,j;
	for(i=1;i<r;i++){
		for(j=1;j<=i;j++){
			System.out.print(j);
		}	System.out.println();
	}
}

public void showstar (){
	int i,j;
	for(i=1;i<5;i++){
		for(j=1;j<=i;j++){
			System.out.print("*");
		}	System.out.println();
}}

public void showstar1(){
	int i,j,k;
	for(i=1;i<=5;i++){
		for(k=0;k<5-i;k++){
			System.out.print("  ");}
		for(j=1;j<=i;j++)
			System.out.print("*"+" ");
			System.out.println("");
	}
}

public void showstarrev(){
	int i,j;
	for(i=5;i>=1;i--){
		for(j=1;j<i;j++){
			System.out.print("*"+" ");
		}	System.out.println();
	}
}
}
