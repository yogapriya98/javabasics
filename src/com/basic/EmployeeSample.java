package com.basic;

import java.util.Scanner;

public class EmployeeSample {
	public void Salary() {
	int count1=0;
	int count2=0;
    int count3=0;
    int count4=0;
    int count5=0;
    int count6=0;
    int count7=0;
    int count8=0;
    int count9=0;
    int j;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of employees :");
	int n = scan.nextInt();
	
	
	int[] employee = new int[n];
  System.out.println("Enter the salesvalue");
    for (int i=0; i<n; i++) {
	employee[i] = scan.nextInt();
 }
    
    for( j=0; j<n; j++) {
    	employee[j] = (200+(9*employee[j])/100);
    
    if(employee[j]>200 && employee[j]<300) {
    	count1++;
    }
    if(employee[j]>300 && employee[j]<400) {
    	count2++;
       }
    if(employee[j]>400 && employee[j]<500) {
    	count3++;
    }
    if(employee[j]>500 && employee[j]<600) {
    	count4++;	 
    }
    if(employee[j]>600 && employee[j]<700) {
    	count5++;
    }
    if(employee[j]>700 && employee[j]<800) {
    	count6++;
    }
    if(employee[j]>800 && employee[j]<900) {
    	count7++;
    }
    if(employee[j]>900 && employee[j]<1000) {
    	count8++;
    }
    if(employee[j]>1000 && employee[j]<1100) {
    	count9++;
    }
    }
   System.out.println("range between 200 to 300 is "+count1);
   System.out.println("range between 300 to 400 is "+count2);
   System.out.println("range between 400 to 500 is "+count3);
   System.out.println("range between 500 to 600 is "+count4);
   System.out.println("range between 600 to 700 is "+count5);
   System.out.println("range between 700 to 800 is "+count6);
   System.out.println("range between 800 to 900 is "+count7);
   System.out.println("range between 900 to 1000 is "+count8);
   System.out.println("range between 1000 to 1100 is "+count9);
	}
    public static void main(String[] args) {
    	EmployeeSample emp = new EmployeeSample();
    	emp.Salary();
		
	}
    }
