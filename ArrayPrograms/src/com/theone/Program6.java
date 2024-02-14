package com.theone;
//write a java program to find the index of an array element

public class Program6 {
	public static int findIndex(int[] arr, int t) {
		if(arr==null) {
			return -1;
			}
		int i=0;
		while(i<arr.length) {
			if(arr[i]==t) {
				return i;
			}
			else {
					i=i+1;
				
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr= {23,43,25,44,1,2,4,12,44,54,32,21,2,3};
		System.out.println("Index position of 25 is: "+findIndex(arr,25));
		System.out.println("Index position of 21 is: "+findIndex(arr,21));
		

	}

}
