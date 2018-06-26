package com.java.LogicalPrograms;

import java.util.Scanner;

public class evenOddcount {
	static int evenCount=0;
	static int oddCount=0;
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=scan.nextInt();
		if(size>0) {
		int a[]=new int[size];
		System.out.println("Enter elements of array");
		for (int  i= 0;  i<size; i++) {
			a[i]=scan.nextInt();
		}
		for (int j = 0; j < size; j++) {
		   if(a[j]%2==0) {
			   evenCount++;
		   }
		   else {
			   oddCount++;
	  }
   }
}	

		else 
			System.out.println("Invalid Input");
   System.out.println(evenCount);
   System.out.println(oddCount);
	}
}
