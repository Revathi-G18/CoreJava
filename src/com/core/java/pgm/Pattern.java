package com.core.java.pgm;

public class Pattern {
	public void show(int r) {
		int i, j;
		for (i = 1; i < r; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public void showstar() {
		int i, j;
		for (i = 1; i < 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void showstar1() {
		int i, j, k;
		for (i = 1; i <= 5; i++) {
			for (k = 0; k < 5 - i; k++) {
				System.out.print("  ");
			}
			for (j = 1; j <= i; j++)
				System.out.print("*" + " ");
			System.out.println("");
		}
	}

	public void showstarrev() {
		int i, j;
		for (i = 5; i >= 1; i--) {
			for (j = 1; j < i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public void box() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 ) {
					System.out.print("_");
				} else if(i==5){
					System.out.print("-");
				}
				else if (j == 1 || j == 5) {
					System.out.print("|");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}
