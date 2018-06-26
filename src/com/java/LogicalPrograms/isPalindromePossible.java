package com.java.LogicalPrograms;

public class isPalindromePossible {
			public boolean canMakePalindrome(int number) {
				String numberstr=number+"";
			     boolean isEven=false;
				int length=numberstr.length();
				 
				if(length%2==0) {
					isEven=true;
				}
					else {
					isEven=false;
				} 
			//	int b=Integer.toString(number).length();   (ans):8
			//	System.out.println(b);
				int[] arr=new int[10];
				int r=0;
				int numberCopy=number;
				while(numberCopy>0) {
					r=numberCopy%10;
					arr[r]=arr[r]+1;
					numberCopy=numberCopy/10;	
				}
				int flag=0;
			if(isEven) {
				for (int i = 0; i <10 ; i++) {
					if(arr[i]%2==1) {
						flag=1;
						break;
					}
				}
					if(flag==1) {
							return false;
					}else {
						return true;
					}
				}
			else {
				int oddNumberCount=0;
				for (int i = 0; i < 10; i++) {
					if(arr[i]%2==0) {
						oddNumberCount++;
					}
			}
			if(oddNumberCount==1) {
				return true;
			}else {
				return false;
			}
		}
   }
    public static void main(String[] args) {
    		isPalindromePossible pp =new isPalindromePossible();
    		boolean result=pp.canMakePalindrome(12213443);  // true
    		System.out.println(result);
    }
}