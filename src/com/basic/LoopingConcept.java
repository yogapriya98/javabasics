package com.basic;

public class LoopingConcept {
	public static void main(String s[]) {
		int i=1;
		do
		{
			System.out.println("i =" + i);
			++i;
		}while(i<10);
		
		for(i=1; i<10; i++)
		{
			System.out.println(i);
		}
	}

}
