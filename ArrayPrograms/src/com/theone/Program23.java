package com.theone;

import java.util.Arrays;

// write a java program to check if an array of integers is without 0 and -1.

public class Program23 {
	
	public static boolean contains(int[] arr, int temp){
		for(int n:arr){
			if(temp==n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr= {34,5,0,3,1,2,7,8,9,6,4,2,3,444,6,7,78};
		System.out.println("Original array: "+Arrays.toString(arr));
		
		System.out.println(contains(arr,(-1)));
		

	}

}
