package com.training.unit03.main;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		
		int x;
		double fx;
		Scanner sc= new Scanner(System.in);
				
		System.out.println("������� �������� [x]");
		System.out.println(">");
		
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("�� ����� �� ���������� ��������");
			
		}	
		
		x=sc.nextInt();
		
		if (x<=-3) {
			System.out.println("F(x) ��� �="+x+" ����� = 9");
		} else if (x>3) {
			double y;
			y = (double) 1/((x*x)+1);
			fx = y;
			System.out.printf("F(x) ��� �= %d  ����� %.5f ", x, fx);
				
		} else {
		System.out.println("�� ����� �������� �������� [�]");
		}
	}
}

