package com.training.unit03.main;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		double value;
		double a;
		double b;
		double c;
		double d;
		
				
			a = 3;
			b = 3.4;
			c = -2;
			d = 1;
		
		value = ((a/c)*(b/d))-((a*b-c)/(c*d));
		
		System.out.printf("Если а=" + a + " b=" + b + " c=" + c + " d=" + d + ", то итог = %.3f" ,value);
						
		
	}

}
