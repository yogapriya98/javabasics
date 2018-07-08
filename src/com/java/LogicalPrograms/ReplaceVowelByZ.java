package com.java.LogicalPrograms;

import java.util.regex.Pattern;

public class ReplaceVowelByZ {
//	public boolean matchPhoneNumber(String phone) {
	//	pattern p=
	//	Matcher m=p.M
	//	boolean b=m.matches;
	//	return b;
	//}
	public void replaceByZ(String input) {
		boolean isVowelPreseent = Pattern.matches(".*[aeiou].*",input);
		System.out.println(isVowelPreseent);
		if(!isVowelPreseent) {
			System.out.println("vowel not present");
		}
		else {
		String output =input.replaceAll("[aeiou]","z");    // using regex
		System.out.println(output);
	}
	}
		public static void main(String[] args) {
			ReplaceVowelByZ rz= new ReplaceVowelByZ();
		//	rz.replaceByZ("9842590123 fawefawe");
			rz.replaceByZ("hello how are you");
		}
	}
