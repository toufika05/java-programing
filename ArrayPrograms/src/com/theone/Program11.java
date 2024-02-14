package com.theone;

import java.util.Arrays;

// write a java program to find duplicate values in an array of integer values

public class Program11 {

	public static void main(String[] args) {
		int[] arr= {34,5,3,1,2,7,8,9,6,4,2,34,444,6,7,78};
		System.out.println("Original array: "+Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j] && (i != j)) {
					System.out.println("Duplicate element: "+arr[j]);
					
					
				}
			}
		}
		

	}

}
