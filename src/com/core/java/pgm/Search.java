package com.core.java.pgm;

import java.util.Arrays;

public class Search {
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
/*public int[] merge(int num[]){
	int first,last,temp,i,j,mid;
	int size = num.length;
	first=0;
	last=size-1;
	for(i=0;i<size;i++){
		mid = (first + last) / 2;
		
		
	}
}*/
}
