package com.core.java.pgm;

public class DigitToString {
	public String units[] = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };

	public String tens[] = { "", "","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty", "Ninety"};
	
	public  String convert(int n) {
		if (n < 0) {return "Minus " + convert(-n);		}

		if (n < 20){return units[n];}

		if (n < 100){return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];	}

		return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
		}

		}
