package com.java.lang;

import com.basic.Car;
import com.basic.Taxi;

public class CloneExample implements Cloneable{
	     Car car;
	     Taxi taxi;
	     public CloneExample(){
	    	car = new Car();
	    	taxi = new Taxi();

}
	     public static void main(String[] args) {
			CloneExample ce1 = new CloneExample();
			try {
				CloneExample ce2 = (CloneExample)ce1.clone();
				System.out.println(ce1.hashCode()+"="+ce2.hashCode());
				System.out.println(ce1.car.hashCode()+"   car hashcode  "+ce2.car.hashCode());
				System.out.println(ce1.taxi.hashCode()+"  taxi hashcode  "+ce2.taxi.hashCode());

			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
	     }
}
