package com.core.java.pgm;

public class Switch {
	public String getgrade(int english, int physics, int chemistry) {
		int total = (english + physics + chemistry) / 3;
		int quotient = total / 10;

		switch (quotient) {
		case 10:
		case 9:
			return "A";
		case 8:
			return "A-";
		case 7:
			return "B+";
		case 6:
			return "B";
		case 5:
			return "B-";// 4,3,2,1
		}
		return "FAIL";
	}

	public String usingArray(int english, int physics, int chemistry) {
		String grade = "";
		String arr[] = { "", "D-", "D", "C-", "C", "B-", "B", "A-", "A", "A+" };
		int total = (english + physics + chemistry) / 3;
		int quotient = total / 10;
		int size = arr.length;
		grade = arr[quotient];
		return grade;
	}
}
