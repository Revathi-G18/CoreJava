package com.core.java.pgm;

public class For {
	public String getgrade(int english, int physics, int chemistry) {
		int total = (english + physics + chemistry) / 3;
		if (total > 90) {
			return "A+";
		}
		//do we need to check two conditons??
		else if (total > 80 && total < 89) {
			return "A";
		} else if (total > 70 && total < 79) {
			return "A -";
		} else if (total > 60 && total < 69) {
			return "B+";
		}
		return "fail";
	}
}
