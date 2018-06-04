package com.Interface;
import static java.lang.Math.PI;     // static importer(variables)
import static java.lang.Math.abs;    // static importer(methods)
public class Test {
	public static void main(String args[]) {
		Travel travelOne = new Car();
		Travel travelTwo = new Dog();
		System.out.println(travelOne instanceof Car);
		 Travel travelThree = new Rabbit();  //behave like travel
		 Owner owner =(Rabbit)travelThree;     //behave like owner(TypeCast)
		 
		 double d = PI;//(or)double d = Math.PI;
		 abs(5);
}
}
