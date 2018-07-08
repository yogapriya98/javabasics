package com.java.LogicalPrograms;

import java.util.Scanner;

public class LargestPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.next();
		string=string.toUpperCase();
		int len=string.length();
		int frq[]=new int[26];
		char ch[]=string.toCharArray();
		for(int i=0;i<len;i++)
		{
			int a=((int)(ch[i]))-64;
			frq[a]++;	
		}
		int count=0;
		int count1=0;
		for (int j = 0; j < frq.length; j++) {
		    	if(frq[j]==1)
		    		count1=1;  
		    else
		    count=count+frq[j];
		  
		}if(count==0)
	        System.out.println("-1");
		else if(count%2==1)
			System.out.println(count);
		else
		 System.out.println(count+count1);
	}
}