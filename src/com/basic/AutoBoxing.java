package com.basic;

public class AutoBoxing {
	public static void main(String[] args) {
		Integer var = new Integer(12);
		int a = var*2;
		System.out.println(a);
		
		// varargs-java 1.5 feature
        getItem(15,new PoliceCar(),new SportsCar(),new Taxi());
	}
	public static void getItem(int a,Car...car) {
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}
	}

}
