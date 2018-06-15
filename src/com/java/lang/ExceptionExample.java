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
	try {
		ee.getCustomer();
	}   catch (IOException e) {       //MalformedURLException subtype of IOException so,IOException occurs in catch 
		e.printStackTrace();
	}
	try {
		ee.getCustomer2();
	} catch (CustomException e) {
		e.printStackTrace();
	}
  }
  public void getCustomer() throws MalformedURLException,IOException {
	 // ExceptionExample ee = null;
	 // ee.hashCode();
	  URL url = new URL("http://www.google.com");
  }
  public void getCustomer1() throws MalformedURLException {   //throws
	/*  try {
		  ExceptionExample ee = null;
		  ee.hashCode();
         } catch (Exception e) {
			  throw new MalformedURLException();              //throw
		  } */
	  int count = 100;
	  if(count < 50) {
		  throw new MalformedURLException();
     }
  }
  public void getCustomer2() throws CustomException{
	int count = 100;
	if(count<50) {
		throw new CustomException("lesser than 100");	
	}
}
}