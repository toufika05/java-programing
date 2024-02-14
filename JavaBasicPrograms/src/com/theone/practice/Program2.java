package com.theone.practice;

public class Program2 {

	public static void main(String[] args) {
      
		int num=345;
		int output=0;
		while(num!=0) {
			int reminder=num%10;
			output=output*10+reminder;
			num=num/10;
		}
		System.out.println("reverse number is "+output);

	}

}
