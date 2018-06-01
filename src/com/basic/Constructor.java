package com.basic;

public class Constructor {
	double speed;
	String model;
	public Constructor() {
		System.out.println("empty cons called");
	}
	public Constructor(double speed) {
		this.speed = speed;         // constructor overloading
		System.out.println("speed cons called");
	}
	public Constructor(double speed,String model) {   //should follow rules of overloading
		this.speed=speed;			
		this.model=model;
		System.out.println("speed,model cons called");
	}
	public static void main(String[] args){
	Constructor a1 = new Constructor();
	Constructor a2 = new Constructor(15.34);
	Constructor a3 = new Constructor(15.34,"tata");
	}
}
