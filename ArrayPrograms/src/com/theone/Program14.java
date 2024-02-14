package com.theone;

import java.util.Arrays;

// write a java program to find common elements between two integer arrays

public class Program14 {

	public static void main(String[] args) {
		int[] arr1= {34,5,3,1,2,7,8,9,6,4,2,3,444,6,7,78};
		System.out.println(" arr1 elements: "+Arrays.toString(arr1));
		
		int[] arr2= {2,34,5,6,7,89,876,5,44,33,22,2,8,78,999,40};
		System.out.println("arr2 elements: "+Arrays.toString(arr2));
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i]==(arr2[j])){
					System.out.println("the common element is: "+arr2[j]);
					
				}
			}
		}
		
		

	}

}
