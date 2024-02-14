package com.theone.practice;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=874;
		int output=0;
		int input=num;
		while(num!=0) {
			int rem=num%10;
			output=output*10+rem;
			num=num/10;
		}
		if(input==output) {
			System.out.println(output+" is a palindrom number");
			
		}else {
			System.out.println(output+" is not a palindrom number");
		}
		
		} 
}