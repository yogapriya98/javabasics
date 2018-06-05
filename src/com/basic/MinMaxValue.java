package com.basic;

public class MinMaxValue {
	public static void main(String[] args) {
		
	int[] arr= new int[]{3,4,5,2,33,24,2};
	int min = arr[0];
	int max = arr[0];
    for(int i=1;i<arr.length;i++) {
    if(arr[i]>max)
    {
    	max = arr[i];
    }
    else if(arr[i]<min) {
    	min = arr[i];
    }
    }
    System.out.println("max value of array is "+max);
    System.out.println("min value of array is "+min);
    
}
}