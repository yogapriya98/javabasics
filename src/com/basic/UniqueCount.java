package com.basic;

public class UniqueCount {
	public static void main(String[] args) {
		
		int count =0;
		int a[] = new int[10];
		int n = 1254333122;
		int r = 0;
		while(n!=0) {
			r = n%10;
			a[r]  =a[r]+ 1;
			n=n/10;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>=1)
				System.out.println(i);
			
}
	//	System.out.println(count);
		}
}

