package com.theone;

///write a java program to sum values of an array

public class Program2 {

	public static void main(String[] args) {
		int[] arr= {4,5,6,7,8,9,1,2,3,4,78};
		int sum=0;
		
		/*
		 * for(int i=0; i<arr.length; i++)
		 *  {
		 *   sum=sum+arr[i];
		 *    }\
		 */
		
		for(int i: arr)
			sum+=i;
		
		System.out.println(sum);
		

	}

}
