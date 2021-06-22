package com.training.unit03.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		double total;

		System.out.println("Введите целые числа a, b,c");
		Scanner scan1 = new Scanner (System.in);
		Scanner scan2 = new Scanner (System.in);
		Scanner scan3 = new Scanner (System.in);
		
		while(!scan1.hasNextInt()) {
			scan1.nextLine();
			System.out.println("Вы ввели не целое число, введите целое");
		
		}
		
		double a = scan1.nextInt();
		
		while(!scan2.hasNextInt()) {
			scan2.nextLine();
			System.out.println("Вы ввели не целое число, введите целое");
		
		}
		double b = scan2.nextInt();
		
		while(!scan3.hasNextInt()) {
			scan3.nextLine();
			System.out.println("Вы ввели не целое число, введите целое");
		
		}
		double c = scan3.nextInt();
			
		
		total = (a*a)-((b-c)*(b-c))+Math.log((b*b)+1);
		
		System.out.println("Ответ="+total);
		

	}

}
