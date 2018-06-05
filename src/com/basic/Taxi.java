package com.basic;

public class  Taxi extends Car{
	int i=10;
	//Constructor chaining
	
	public Taxi() {
	//	super();
	System.out.println("taxi brake call");
	}
	public Taxi(int i) {
		this.brake();
		System.out.println("arg cons called");
	}
	// Override method 
	   @Override                        //if not override superclass brake method is called
	     public void brake() {
		 System.out.println("taxi brake");
	}
public static void main(String args[]) {
	Taxi taxi = new Taxi(10);
	taxi.brake();
	
	//ObjectSubtitution
	
	Car car = new Taxi();
	car.brake();
	System.out.println(car.i); //within a package -no modifier can access
	// instanceof
	
	System.out.println(car instanceof Taxi);
}
}
