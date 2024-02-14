package com.theone;

//write a java program to test if an array contains a specific value.

public class Program5 {
	
	public static boolean contains(int[] arr, int item) {
		for(int n:arr) {
			if(item== n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr= {34,54,2,3,567,87,679,9,7,1,34,556,788};
		System.out.println(contains(arr,9));
		System.out.println(contains(arr,90));
		
	}

}
