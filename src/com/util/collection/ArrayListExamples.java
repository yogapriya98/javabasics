package com.util.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class ArrayListExamples {
     public static void main(String[] args) {	 
	List<String> arraylist = new ArrayList<String>();  // List can allow duplicates of elements
/*	arraylist.add("one");
	arraylist.add("two");
	arraylist.add("three");
	System.out.println(arraylist.get(2));
*/	
	arraylist.add("one");
	arraylist.add("two");
	arraylist.add("three");
	arraylist.add("one");
	System.out.println(arraylist.size());
	System.out.println(arraylist.toString());
	
	List<String> linkedlist = new LinkedList<String>();
	linkedlist.add("one");
	linkedlist.add("two");
	linkedlist.add("three");
	linkedlist.add("one");         
	System.out.println(linkedlist.toString());
	  
	}
}

