package com.java.LogicalPrograms;

import java.util.Scanner;

public class UserIdGeneration {
	
	public void IdGeneration(String first_Name,String last_Name,String pin,int N) {
		int len1=first_Name.length();
		int len2=last_Name.length();
		String small_Name="";
		String large_Name="";
		String result="";
		String result1="";
		
		if(N <=pin.length()) {
		if(len2>len1) {
			small_Name+=first_Name;
			large_Name+=last_Name;
		}else if(len2<len1) {
			small_Name+=last_Name;
			large_Name+=first_Name;
		}else {
			if(len2==len1) {
			for (int i = 0; i <len1 ; i++) {
			  if((int)first_Name.charAt(i)>(int)last_Name.charAt(i)) {
				    small_Name+=last_Name;
					large_Name+=first_Name;
					break;
			  }else if((int)first_Name.charAt(i)<(int)last_Name.charAt(i)) {
				    small_Name+=first_Name;
					large_Name+=last_Name;
					break;
			  }
			}
		}
	}
		char ch=(small_Name.charAt(small_Name.length()-1));
		String ch1="";
		ch1+=pin.charAt(N-1);
		ch1+=pin.charAt(pin.length()-N);
		result+=(ch+large_Name);
		
		char e[]=result.toCharArray();
		for (int i = 0; i <result.length(); i++) {
			if(Character.isUpperCase(e[i])){
				result1+=Character.toLowerCase(e[i]);
			}else if(Character.isLowerCase(e[i])) {
				result1+=Character.toUpperCase(e[i]);
			}
		}
		System.out.println(result1+ch1);
	}
		else {
			System.out.println("ERROR");
		}
   }
	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			String input1=scan.next();
			String input2=scan.next();
			String pin=scan.next();
			int N=scan.nextInt();
			UserIdGeneration ig=new UserIdGeneration();
			ig.IdGeneration(input1, input2, pin, N);
		}
}
