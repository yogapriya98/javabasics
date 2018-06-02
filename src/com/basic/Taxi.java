package com.basic;

public class  Taxi extends Car{
	public Taxi() {
		super();
		System.out.println("empty cons call");
	}
	public Taxi(int i) {
		//super();
		System.out.println("arg cons called");
	}
public static void main(String args[]) {
	Taxi taxi = new Taxi(10);
}
}
