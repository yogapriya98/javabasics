package com.java.LogicalPrograms;

public class Unique { 
	public static void main(String[] args) {
		
	
		int a[] = new int[10];
		int n = 1254333195;
		int r = 0;
		while(n!=0) {
			r = n%10;
			a[r]  = 1;
			n=n/10;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>=1)
				System.out.println(i);
}
		}
}
