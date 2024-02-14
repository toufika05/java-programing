package com.theone;

import java.util.Arrays;

// write a java program to find the second smallest element in an array

public class Program17 {

	public static void main(String[] args) {
		int[] arr= {34,5,3,1,2,7,8,9,6,4,2,3,444,6,7,78};
		System.out.println("Original array: "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sorting thr array: "+Arrays.toString(arr));
		int i=1;
		System.out.println(arr[i]);
		
		

	}

}
