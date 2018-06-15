package com.java.lang;

public class StringExample {
	public StringExample(){

}
	public static void main(String[] args) {
	String st = "Good";  // String literal
	String st1 = new String("Good"); //String obj
	String st2 = "Good";
	System.out.println(st == st2);
	System.out.println(st.equals(st2));
	System.out.println(st.equals(st1));
	System.out.println(st == st1);  
	

	// String immutability check
	
	System.out.println(st.hashCode());    
	st = "bad";                       
	System.out.println(st);
	System.out.println(st.hashCode());
	
	//string method----split()
	
	String s = ("this, is, an, example");
	String ss[] = s.split(",");
	for (int i = 0; i < ss.length; i++) {
		System.out.println(ss[i]);
	}
	
	//String Buffer---->mutability check---->synchronized methods
	
	StringBuffer sb = new StringBuffer();  
	sb.append("one");
	sb.append("two");
	sb.append("three");
	System.out.println(sb);   // can change obj ref value
	
	//String Builder----->non-synchronized methods---->jdk 1.5
	
	StringBuffer sbuilt = new StringBuffer();  //copy of String Buffer
	sbuilt.append("one");
	sbuilt.append("two");
	sbuilt.append("three");
	System.out.println(sb);
	
}
}
