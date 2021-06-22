package com.training.unit03.main;

public class Task07 {
	public static void main(String[] args) {
		
		int a=-4;
		int b=2;
		int c=0;
				
		if (a>=0) {
			if (a!=0) {
						a=a*a;
			System.out.println ("a положительное, а в квадрате ="+a);
			
		} else {
			System.out.println("a = 0");
		}
		
		} else {
		a= a*a*a*a;
		System.out.println("a отрицательное, а в 4 степени ="+a);
		}
		
		if (b>=0) {
			if (b!=0) {
						b=b*b;
			System.out.println ("b положительное, b в квадрате ="+b);
			
		} else {
			System.out.println("b = 0");
		}
		
		} else {
		b= b*b*b*b;
		System.out.println("b отрицательное, b в 4 степени ="+b);
	}
		if (c>=0) {
			if (c!=0) {
						c=c*c;
			System.out.println ("c положительное, c в квадрате ="+c);
			
		} else {
			System.out.println("c = 0");
		}
		
		} else {
			a= a*a*a*a;
			System.out.println("c отрицательное, c в 4 степени ="+c);
		}
	}
}