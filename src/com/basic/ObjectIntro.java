package com.basic;

public class ObjectIntro {
	private String model;
	private double speed;
	public ObjectIntro() {
		
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

	public static void main(String s[]) {
		ObjectIntro a1 = new ObjectIntro();
		ObjectIntro a2 = new ObjectIntro();
		a1.speed = 12.23;
		a2.speed = 16.23;
		System.out.println(a1.speed);
		System.out.println(a2.speed);
		
		
	}

}
