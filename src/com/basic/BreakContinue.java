package com.basic;

public class BreakContinue{
	public static void main(String s[]){
		int i;
		for( i=0; i<10; i++) {
			if(i==3) {
				continue;
		}
			System.out.println(i);
			if( i == 5){
				break;
			}
		}
	}
}
		
	

