package com.basic;

public class Car {
	private String model;
	private double speed;
	public Car() {
		System.out.println("cons called");
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
    public boolean start() {
    	return true;
    	
    }
    public void accelerate() {
    	speed+=5;
    	
    }
     public void brake() {
    	 System.out.println("car brake");
     }
	public static void main(String s[]) {
		Car car1 = new Car();
		Car car2 = new Car();
		car1.speed = 21.31;
		car2.speed = 15.23;
		System.out.println(car1.speed);
		System.out.println(car2.speed);
		
		
	}

}
