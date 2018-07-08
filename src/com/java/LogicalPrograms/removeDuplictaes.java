package com.java.LogicalPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class removeDuplictaes {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter size of the number");
			int number=scan.nextInt();
			System.out.println("Enter elements of array");
			int arr[]=new int[number];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=scan.nextInt();
			}
			int result[]=new int[10];
			Arrays.sort(arr);
			int x=0;
			for (int i = 0; i < arr.length-1; i++) {
				if(i==arr.length-1) {
					result[x]=arr[i];
					x++;
				}
				else if(arr[i]!=arr[i+1]) {
					result[x]=arr[i];
					x++;
				}
			}
		 }
    	}



