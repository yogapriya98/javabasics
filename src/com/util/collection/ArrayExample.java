package com.util.collection;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExample {
	public static void main(String[] args) {
		int one[] = {4,5,58,65,4};
		int two[] = Arrays.copyOf(one, one.length);
		for(int i=0;i<one.length;i++)
		System.out.println(two[i]);
		
		 System.out.println("--------");
		 
		Arrays.sort(one);
		for (int j = 0; j < two.length; j++) {
		System.out.println(one[j]);
	}
		Employee emp = new Employee(1,25213.124,"vedha");
		Employee emp1 = new Employee(2,16423.124,"sarvesh");
		Employee emp2 = new Employee(3,213.124,"sudhan");
		Employee emp3 = new Employee(4,874513.124,"janani");
		Employee emp4 = new Employee(5,485213.124,"surya");
		Employee[] arr = {emp,emp1,emp2,emp3,emp4};
		
		System.out.println("---------");
		
		System.out.println(Arrays.toString(arr));	
		
		Comparator<Employee> comparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
		    if(o1.getSalary() > o2.getSalary()) {
		    	return 1;
		    }
				return -1;
			}
		};
		Arrays.sort(arr,comparator);
		System.out.println(Arrays.toString(arr));	
	}
}
