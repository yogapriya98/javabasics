package com.java.lang;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class ExceptionExample {
	public ExceptionExample() {
		try {
		// arithmetic exception-->runtime
		int count = 5;
    	double d = count/0;
		}catch (Exception e) {            //  using try catch -->handling the exception
			
		}
		// arrayIndexOutofBounce exception
		int a[]  = {1,25,6,5,5};
	//	System.out.println(a[6]);
		try {
		URL url = new URL("http://www.google.com");
		URLConnection connection = url.openConnection();
		System.out.println("last line of try");
	}catch(MalformedURLException e) {
		e.printStackTrace();
	}catch(IOException e) {
	     e.printStackTrace();
	}finally {
		System.out.println("call finally");
	}
		System.out.println("after finally");
	}
  public static void main(String[] args) {
	ExceptionExample ee = new ExceptionExample();
}
}
