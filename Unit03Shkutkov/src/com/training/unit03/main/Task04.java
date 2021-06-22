package com.training.unit03.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
				
		int n1;
		int n2;
		int n3;
		
		int tot;
				
				
		System.out.println("Введите 3 целых числа");
		
		while(!sc1.hasNextInt()) {
			sc1.nextLine();
			System.out.println("Вы ввели не целое число, введите целое");
		
		}
		
		n1 = sc1.nextInt();
		
		while(!sc2.hasNextInt()) {
			sc2.nextLine();
			System.out.println("Вы ввели не целое число, введите целое");
		
		}
		
		n2 = sc2.nextInt();
		
		while(!sc3.hasNextInt()) {
			sc3.nextLine();
			System.out.println("Вы ввели не целое число, введите целое");
		
		}
		
		n3 = sc3.nextInt();
		
		
		tot = n1 + n2 +n3;
		
		System.out.println("Сумма введенных чисел равна ="+tot);
		

	}

}
