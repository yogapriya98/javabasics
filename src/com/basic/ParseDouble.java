package com.basic;

public class ParseDouble {
	public static void main(String[] args) {
		double a;
		double b;
		
		a=Double.parseDouble(args[0]);
	    b=Double.parseDouble(args[1]);
		double c;
		//for(c:args) {
		c = a+b;
		System.out.println(c);
		}
	} 

	/*   public static void main(String[] args) {

	      Double d = new Double("6.35");
	   
	      // returns the double value represented by the string argument
	      String str = "50";
	      double retval = d.parseDouble(str);
	      System.out.println("Value = " + retval);
	   } */
