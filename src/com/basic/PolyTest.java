package com.basic;

public class PolyTest {
	public static void main(String args[] ) {
		
		//using final-keyword
		
		final int count=10;
		//inspite of using final we can change instant variable 
		final Taxi t = new Taxi();
		
		PolyTest pt = new PolyTest();
		SportsCar sc = new SportsCar();
		PoliceCar pc = new PoliceCar();
		Taxi taxi = new Taxi();
		pt.brake(pc);
		pt.brake(sc);
		pt.brake(taxi);
	}
		//polymorphic collections:
	
	/*	Car car[] = {new Taxi(),new SportsCar(),new PoliceCar()};
	  */
	
	public void brake(Car car) {
		car.brake();
	}
}