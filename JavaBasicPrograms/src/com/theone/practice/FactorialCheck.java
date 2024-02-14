package com.theone.practice;

public class FactorialCheck {

	public static void main(String[] args) {
     int[] nums= {2,3,4,5,6,7};
     for(int i=0; i<nums.length; i++) {
    	 int num=nums[i];
    	 int fact=1;
    	 for(int j=1; j<=num; j++) {
    		 fact=fact*j;
    		
    	 }
    	 
		 System.out.println(nums[i]+" factorial number is: "+fact);	
    	
     }

	}

}
