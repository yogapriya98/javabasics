package com.basic;

public class Sta {
	static int count = 10;
	
	static{
		count++;
		System.out.println("1st static call"+count);
	}
	public Sta() {
		count++;
		System.out.println("cons call"+count);
	}
	public void getItem() {       //static var can access ins method bt viceversa not possible
		count++;
		System.out.println("ins method call"+count);
	}
	public static void getCus() {
		count++;
		System.out.println("static method call"+count);
	}
	public static void main(String[] args) {
		Sta sta = new Sta();
		sta.count++;
		sta.getItem();
		sta.getCus();
		System.out.println("value of count : "+count);
	
		
	}
	static {
		count++;
		System.out.println("2ad static call"+count);
	}
	}
