package com.theone.practice;

public class PerfectNumber {

	public static void main(String[] args) {
       int num=6;
       int input=num;
       int output=0;
       for(int i=1; i<=num/2; i++) {
    	   if(num%i==0) {
    		   output=output+i;
    	   }
       }
       if(input==output) {
    	   System.out.println(output+" is perfect number");
       }else {
    	   System.out.println(output+" is not a perfect number");
       }

	}

}
