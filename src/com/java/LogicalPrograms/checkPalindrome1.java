package com.java.LogicalPrograms;

import java.util.Scanner;

public class checkPalindrome1 {     //check if string is palindrome

	   public static void main(String args[])
	   {
	      String str, rev = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = sc.next();
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equalsIgnoreCase(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	 
	   }
	}

