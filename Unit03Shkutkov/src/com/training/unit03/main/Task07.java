package com.training.unit03.main;

public class Task07 {
	public static void main(String[] args) {
		
		int a=-4;
		int b=2;
		int c=0;
				
		if (a>=0) {
			if (a!=0) {
						a=a*a;
			System.out.println ("a �������������, � � �������� ="+a);
			
		} else {
			System.out.println("a = 0");
		}
		
		} else {
		a= a*a*a*a;
		System.out.println("a �������������, � � 4 ������� ="+a);
		}
		
		if (b>=0) {
			if (b!=0) {
						b=b*b;
			System.out.println ("b �������������, b � �������� ="+b);
			
		} else {
			System.out.println("b = 0");
		}
		
		} else {
		b= b*b*b*b;
		System.out.println("b �������������, b � 4 ������� ="+b);
	}
		if (c>=0) {
			if (c!=0) {
						c=c*c;
			System.out.println ("c �������������, c � �������� ="+c);
			
		} else {
			System.out.println("c = 0");
		}
		
		} else {
			a= a*a*a*a;
			System.out.println("c �������������, c � 4 ������� ="+c);
		}
	}
}