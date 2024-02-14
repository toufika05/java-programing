package com.theone.practice;

public class StrongNumber {

	public static void main(String[] args) {
      int num=145;
      int input=num;
      int output=0;
      while(num!=0) {
    	  int rem=num%10;
    	  int fact=1;
    	  for(int i=1; i<=rem; i++) {
    		  fact=fact*i;
    	  }
    	  output=output+fact;
    	  num=num/10;
      }
      if(input==output) {
    	  System.out.println(output+" is strong number");
      }
      else {
    	  System.out.println(output+" is not a strong number");
      }
	}

}
