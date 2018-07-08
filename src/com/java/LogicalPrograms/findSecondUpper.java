package com.java.LogicalPrograms;

import java.util.Scanner;

public class findSecondUpper {
	   public static void main ( String [] args )
	    {
	      String input1="wipro technologies";
	      String arr[]=input1.split(" ");
	      int length=arr.length;
	      if(length>1) {
	    	  String b=arr[1].toUpperCase();
	    	  System.out.println(b);
	      }else
	    	  System.out.println("LESS");
	      
	    }
}
	 
		
	
