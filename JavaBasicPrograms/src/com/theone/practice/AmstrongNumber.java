package com.theone.practice;

public class AmstrongNumber {

	public static void main(String[] args) {
	 int num=143;
	 int output=0;
	 int input=num;
	 while(num!=0) {
		 int rem=num%10;
		 output=output+(rem*rem*rem);
		 num=num/10;
	 }
	 if(input==output) {
		 System.out.println(output+" is a amstrong number");
	 }
	 else {
		 System.out.println(output+" is not a amstrong number");
		 
	 }


	}
	

}
