package com.java.LogicalPrograms;

import java.util.Scanner;

public class factorial {
	static int fact=1;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  number");
		int number=sc.nextInt();
		if(number<0) {
			System.out.println("Invalid Input");
		}
		else {
		for (int i = 1; i <= number; i++) {
		     fact=fact*i;
		}
	System.out.println(fact);	
	}
	}
}
