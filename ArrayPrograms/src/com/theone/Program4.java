package com.theone;
// write a java program to calculate the average value of array elements 

public class Program4 {

	public static void main(String[] args) {
		int[] arr= {3,5,6,87,233,4,5,6,7,6,9};
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		double avg=sum/arr.length;
		System.out.println("Average value of the array elements is: "+avg  );

	}

}