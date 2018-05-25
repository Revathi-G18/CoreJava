package com.core.java.pgm;

import java.util.Arrays;

public class Search {
	//follow camel case
	public boolean linearsearch(int number, int num[]) {
		int size = num.length;
		for (int i = 0; i < size; i++) {
			if (num[i] == number) {
				return true;
			}
		}
		return false;

	}

	public boolean binarysearch(int number, int num[]) {
		Arrays.sort(num);
		int first, last, mid;
		int size = num.length;
		first = 0;
		last = size - 1;
		while (num[first] <= num[last]) {
			mid = (first + last) / 2;
			if (num[mid] < number) {
				first = mid + 1;
			} else if (num[mid] == number) {
				return true;
			} else {
				//can't return false directly, number may be present in other position.
				return false;
			}
		}
		return false;
	}

	public int[] bubble(int num[]) {
		int temp;
		int size = num.length;
		for (int i = 0; i < size - 1; i++) {
			if (num[i] > num[i + 1]) {
				temp = num[i];
				num[i] = num[i + 1];
				num[i + 1] = temp;
			}
		}
		return num;
	}

	public int[] selection(int num[]) {
		int min, max, i, j, temp;
		int size = num.length;
		for (i = 0; i < size - 1; i++) {
			min = i;
			for (j = i + 1; j < size - 1; j++) {
				if (num[min] > num[j]) {
					min = j;
					temp = min;
					min = num[i];
					num[i] = temp;
				}

			}
		}
		return num;
	}

	//merge OR mergSort??
	public int[] merge(int num[]) {
		int first, last, temp, i, j, k, mid, arr1[]={}, arr2[]={};
		int size = num.length;
		first = 0;
		last = size;
		int arr3[]={};
		for (i = 0; i < size; i++) {
			mid = (first + last) / 2;
			for (j = 0; j <= mid; j++) {
				arr1[j] = num[j];
			}
			//should not use sort method.
			Arrays.sort(arr1);
			
			for (k = mid+1; k < size; k++) {
				arr2[i] = num[k];
			}//should not use sort method.
			Arrays.sort(arr2);
			int l=0,m=0,n=0;
			
			
			int sizeofarr1=arr1.length;
			int sizeofarr2=arr2.length;
			while(l<size && m<sizeofarr1){		
				if(arr1[i]<arr2[j]){
					arr3[n]=arr1[l];
					l++;
				}else{
					arr3[n]=arr2[m];
					m++;
				}n++;
			}
			if(l<sizeofarr1){
				for(;l<sizeofarr1;l++){arr3[n]=arr1[i];}
			}
			if(m<sizeofarr2){
				for(;m<sizeofarr2;m++){
					arr3[n]=arr2[l];
				}
			} 
		}return arr3;
		}
		
		
		
	}

