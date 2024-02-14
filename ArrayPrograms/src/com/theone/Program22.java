package com.theone;

import java.util.Arrays;

// write a java program to find the number of even and odd integers in a given array of integer

public class Program22 {

	public static void main(String[] args) {
		int[] arr= {34,5,3,1,2,7,8,9,6,4,36,444,6,7,78};
		System.out.println("Original array: "+Arrays.toString(arr));
		
		
	  for(int i=0 ;i<arr.length; i++){
		  if(arr[i]%2==0) {
			
			  System.out.println("even number: "+arr[i]);
		  }
		 else {
		  System.out.println("Odd number: "+arr[i]);
		  }
		
	}
	//	System.out.println("Number of even numbers: "+c);
	//s	System.out.println("Number of add numbers: "+(arr.length-c));

	}

}
