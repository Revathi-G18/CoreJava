package com.core.java.pgm;

public class even {
	public void even() {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i);
				if (i < 20) {
					System.out.print(",");
				}
			}

		}

	}
}
