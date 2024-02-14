package com.theone;

import java.util.Arrays;
//write a java program to check if an array of integers contains two specified elements 65 and 77

public class Program3{
	
	public static boolean contains(int[] arr, int temp) {
		for(int n: arr) {
			if(temp==n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr= {34,5,3,1,2,7,8,9,6,4,2,3,444,65,6,7,78};
		System.out.println("Original array: "+Arrays.toString(arr));
		 System.out.println("check the number is present or not: "+(contains(arr,65)));

	}
}