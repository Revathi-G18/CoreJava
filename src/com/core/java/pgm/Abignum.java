package com.core.java.pgm;

public class Abignum {
public int[] big(int num[]){
	int max=num[0],i,index=0;
	int size=num.length;
	for(i=0;i<size;i++){
		if(max<num[i]){
			max=num[i];
			index=i;
		}
	}return new int[] {max,index};
}
public int sum(int num[]){
	int sum=0;
	int size=num.length;
	for(int i=0;i<size;i++){
		sum=sum+num[i];
	}return sum;
}

public int[] merge(int num[],int num1[]){
	int i,j,count=0;
	int num2[]= new int[num.length+num1.length];
	int size=num.length;
	int size1=num1.length;
	for(i=0;i<size;i++){
		num2[i]=num[i];
		count++;
		}
	for(j=0;j<size1;j++){
		num2[count++]=num1[j];
	}return num2;
}	

public int[] insert(int num[],int number,int position){
	int size=num.length;
	for(int i=size-1;i>position;i--){
		num[i]=num[i-1];
	}
	num[position]=number;
	return num;
}

public int[] deleteposition(int num[],int position){
	int size=num.length;
	for(int i=position;i<size-1;i++){
	num[i]=num[i+1];
			}
	num[size-1]=0;
		return num;
}

public int[] deletenumber(int num[],int number){
	int size=num.length;
	for (int i=0;i<size;i++){
		if(num[i]==number){
			num[i]=num[i+1];
		}
		}
	num[size-1]=0;
	return num;
}
}
