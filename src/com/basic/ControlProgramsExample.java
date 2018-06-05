package com.basic;

public class ControlProgramsExample {
	public static void main(String s[]) {
		int count=10;
		if(count < 20) {
			System.out.println("true");
		}
			else {
				System.out.println("false");
			}
		System.out.println((count <20)?10:20);
		switch(3) {
			case 1:
				System.out.println("10");
				break;
			case 2:
				System.out.println("20");
				break;
				default :
					System.out.println("none");
		}
		while(count < 20) {
			System.out.println(count);
			count++;
		}
		int i=0;
		do {
			System.out.println("do while "+i);
			i++;
		}while(i<10);
		
		
		for (i=0; i<10; i++) 
		System.out.println("for "+i);


	for (i=0; i<10; i++) {
		if(i==3) {
			continue;
		}
	System.out.println("for break"+i);
	if(i==5) {
	 break;
	}
		}
}
}
		


