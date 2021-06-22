package com.training.unit03.main;

public class Task05 {
	

	public static void main(String[] args) {
	
	double sum;
		
	double a=5;
	double b=2.4;
	double c=1;
	
	sum = ((b+Math.sqrt((b*b)+4*a*c))/(2*a)-((a*a*a)*c+b));
	
	if (Double.isNaN(sum)) {
		System.out.println("Что-то пошло не так");
		} else {
	System.out.printf("Итого= %.3f", sum);
	}
	}

}
