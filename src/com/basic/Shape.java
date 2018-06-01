package com.basic;

public class Shape {
	double side;
	double length;
	double breath;
	public Shape(double side) {
		this.side=side;
	}
	public Shape(double length, double breath) {
		if(length >0.0 && length <20.0 && breath>0.0 && breath<20.0) {
		this.length=length;
		this.breath=breath;
	}
		else
			System.out.println("length should be between the given limits");
	}
	public double FindAreaofRectangle() {
		return length*breath;
	}
	public double FindAreaofSquare() {
		return side*side;
	}
	public static void main(String args[]) {
		Shape square = new Shape(5);
		Shape rectangular = new Shape(5,15.23);
		Shape side = new Shape(3);
		System.out.println(rectangular.FindAreaofRectangle());
		System.out.println(side.FindAreaofSquare());
		System.out.println(square.FindAreaofRectangle());
	}

}
