package com.core.java.test;

import com.core.java.pgm.Pattern;
import com.core.java.pgm.PatternReverse;

public class PatternTest {
public static void main(String[] args) {
	Pattern pat=new Pattern();
	pat.show(5);
	PatternReverse pr=new PatternReverse();
	pr.show(5);
	pr.display(5);
	pr.showrev(5);
}
}
