package com.basic;

public class Ismultiple {

	public boolean ismultiple(int one, int two) {
		return(two % one ==0) ? true : false;
	}
  public boolean isEven(int one) {
    	return one%2 == 0 ? true : false;
    }
    public double convert(double fahrenheit,boolean switches) {
    	if(switches) {
    		return 5.0 / 9.0 * ( fahrenheit - 32 );
    	}
    	return 0.0;
    }
public double convert(double celsius) {
		   return 9.0 / 5.0 * ( celsius + 32 );
} 
public static void main(String s[]) {
	Ismultiple a1 = new Ismultiple();
	a1.ismultiple(5, 10);
	a1.isEven(10);
    a1.convert(15.62,true);
	a1.convert(15.23);
	System.out.println(a1.ismultiple(5,10));
	System.out.println(a1.isEven(10));
	System.out.println(a1.convert(15.62,true));
	System.out.println(a1.convert(15.23));
}
}

