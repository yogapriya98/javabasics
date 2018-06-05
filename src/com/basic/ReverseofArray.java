package com.basic;

public class ReverseofArray {
	public static void main(String[] args) {
		
		int[] arr= new int[]{3,4,5,2,33,24,2};
		
	    for(int i=arr.length-1;i>0;i--) {
	    	System.out.println(arr[i]);
	    }
	    // ArrayIndexOutofBoundsException
	    
	   arr[8]=10;     // cannot assign 8th element in array
	    
	}
}