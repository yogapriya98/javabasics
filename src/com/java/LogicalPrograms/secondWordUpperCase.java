package com.java.LogicalPrograms;

import java.util.Scanner;

public class secondWordUpperCase {
	public void changeSecondUpper(String sentence) {
	  String  arr[]=sentence.split(" ");
	  int length=arr.length;
	  for (int i = 0; i < length; i++) {
		   arr[1]=arr[1].toUpperCase();
	}
	  System.out.println(arr[1]);
	}
 public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the sentence");
	String sentence=scan.nextLine();
	secondWordUpperCase sc=new secondWordUpperCase();
	sc.changeSecondUpper(sentence);
}
}
