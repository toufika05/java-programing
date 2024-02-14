package com.theone;

import java.util.Arrays;

///write a java program to remove a specific element from an array

public class Program7 {

	public static void main(String[] args) {
	int[] arr= {2,34,54,67,89,6,5,4,1,2,8,9,75};
	
		System.out.println("original array: "+Arrays.toString(arr));
		int removeIndex=1;
		for(int i=removeIndex; i<arr.length-1; i++){
			arr[i]=arr[i+1];
			
		}
		System.out.println("After removing the second eleengt: "+Arrays.toString(arr));

	}

}



