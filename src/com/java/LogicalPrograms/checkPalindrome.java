package com.java.LogicalPrograms;

import java.util.Scanner;

public class checkPalindrome {
		public void test(int number){    //check if given number is palindrome
			int numberCopy=number;
			int r=0;
			int rev=0;
				while(numberCopy>0) {
					r=numberCopy%10;
					rev=(rev*10)+r;
					numberCopy =numberCopy/10;
				}
			if(rev==number)
				System.out.println("is palindrome number");
			else 
				System.out.println("is not a palindrome number");
		}
			public static void main(String[] args) {
				checkPalindrome cp =new checkPalindrome();
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter the number to find palindrome or not");
				int number=scan.nextInt();
				cp.test(number);
			}
		}

