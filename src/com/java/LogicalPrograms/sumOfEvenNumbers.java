package com.java.LogicalPrograms;

import java.util.Scanner;

public class sumOfEvenNumbers {
	public void sumOfEven(int[] num) {
		int evenCount=0;
		int numCopy[]=num;
		for (int i = 0; i < numCopy.length; i++) {
			if(numCopy[i]%2==0) {
				evenCount++;
			}
		}
		System.out.println(evenCount);
		}
		public static void main(String[] args){
		 sumOfEvenNumbers sm = new sumOfEvenNumbers();
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter a set of numbers ");
		 int[] num=new int[8];
		  for (int i = 0; i < num.length; i++) {
			  num[i]=scan.nextInt();
		}
		 sm.sumOfEven(num);
		
	}

}
