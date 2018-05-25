
package com.core.java.pgm;

public class Abignum {
	//what to return both max and max position?
public int[] big(int num[]){
	int max=num[0],i,index=0;
	int size=num.length;
	for(i=0;i<size;i++){
		if(max<num[i]){
			max=num[i];
			index=i;
		}
		//index-1 ??
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
		//why another count variable?
		count++;
		}
	for(j=0;j<size1;j++){
		num2[count++]=num1[j];
	}return num2;
}	

	//why to return?
	//what is call by reference?
public int[] insert(int num[],int number,int position){
	int size=num.length;
	for(int i=size-1;i>position;i--){
		num[i]=num[i-1];
	}
	num[position]=number;
	return num;
}
//why to return?
	//what is call by reference?
public int[] deleteposition(int num[],int position){
	int size=num.length;
	for(int i=position;i<size-1;i++){
	num[i]=num[i+1];
			}
	num[size-1]=0;
		return num;
}
//why to return?
	//what is call by reference?
public int[] deletenumber(int num[],int number){
	int size=num.length;
	for (int i=0;i<size;i++){
		if(num[i]==number){
			num[i]=num[i+1];
		}
		}
	//should shoter -1 instead of 0.
	num[size-1]=0;
	return num;
}

	// is merge sort OR mering two arrays?
public int[] mergesorted(int sortnum1[],int sortnum2[]){
	int i=0,j=0,g=0;
	int size=sortnum1.length;
	int size1=sortnum2.length;
	int k[]=new int[size+size1];
	//int g=IndexOf(k);
	
	while(i<size && j<size1){		
		if(sortnum1[i]<sortnum2[j]){
			k[g]=sortnum1[i];
			i++;
		}else{
			k[g]=sortnum2[j];
			j++;
		}g++;
	}
	if(i<size){
		for(;i<size;i++){k[g]=sortnum1[i];}
	}
	if(j<size1){
		for(;j<size1;j++){
			k[g]=sortnum2[i];
		}
	} return k;
}
}
