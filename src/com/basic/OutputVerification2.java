package com.basic;

public class OutputVerification2 {
	public static void main(String s[]) {
		int count = 1;

		while ( count <= 10 )
		{
		 System.out.println( count % 2 == 1 ? "****" : "++++++++" );
		 ++count;
	}
	}
}
