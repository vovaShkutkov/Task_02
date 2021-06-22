package com.training.unit03.main;

public class Task08 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;
		double y;
		double per = 0;
		
		a= 4.2;
		b= 3;
		h= 0.2;
		
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\r", "x","y");
		System.out.println("---------------------------------");
		
		if (a>b) {
			per = a;
			a=b;
			b = per;
		}
		
		for (double x=a; x<=b; x=x+h) {
			y = (2*Math.tan(x/2))+1;
			System.out.printf("|\t%4.2f\t|\t%4.2f\t|\r", x, y);
		}

	}

}
