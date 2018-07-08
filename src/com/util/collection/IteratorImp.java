package com.util.collection;

import java.util.Iterator;

public class IteratorImp implements Iterator<Integer>{
	int arr[]= {1,2,3,4};
	int currentElement=0;
	boolean  hasElement=true;
	public IteratorImp() {

	}
	@Override
	public boolean hasNext() {
		if(arr.length !=0 && currentElement != arr.length+1){
			currentElement++;
			return hasElement;
	}
		return false;
}
	@Override	
	public Integer next() {
			return arr[currentElement-1];
		}
		
		public static void main(String[] args) {
			IteratorImp impl=new IteratorImp();
			while(impl.hasNext()) {
			System.out.println(impl.next());
		}
		}
}
