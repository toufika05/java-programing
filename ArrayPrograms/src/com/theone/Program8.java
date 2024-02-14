package com.theone;

import java.util.Arrays;

// write a java program to insert an element(specific position) into an array 

public class Program8 {

	public static void main(String[] args) {
		int[] arr= {34,5,3,1,2,7,8,9,6,4,2,3,444,6,7,78};
		System.out.println("Original array: "+Arrays.toString(arr));
		int insertIndex=5;
		int newValue=10;
		for(int i=arr.length-1; i>insertIndex; i--) {
			
			arr[i]=arr[i-1];
		}
		arr[insertIndex]=newValue;
		System.out.println("new Array: "+Arrays.toString(arr));

	}

}
