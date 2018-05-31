package com.basic;

public class PerfectNumber {

	public boolean isperfect(int number) {
		int i,sum=0;
		for(i=1; i<number; i++) {
			if(number%2 == 0) {
				sum+= number;
			}
			
		}	
		return((sum==number) ? true :false);
	}
	public static void main(String s[]) {
		PerfectNumber a1 = new PerfectNumber();
		a1.isperfect(6);
		System.out.println(a1.isperfect(6));
	}
}

