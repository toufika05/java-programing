package com.theone;

import java.util.Arrays;

///write a java program to reverse an array of integer values

public class Program10 {

	public static void main(String[] args) {
		int[] arr= {23,45,65,78,97,80,92,11,23,4,455,667,1000};
		System.out.println("Original arrays: "+Arrays.toString(arr));
		
		for(int i=0; i<arr.length/2; i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			
		}  
		System.out.println("Reverse array: "+Arrays.toString(arr));
		
	
	}

}
