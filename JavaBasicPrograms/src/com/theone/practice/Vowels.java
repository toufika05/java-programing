package com.theone.practice;

public class Vowels {

	public static void main(String[] args) {
		
		int[] arr= {2,3,4,8,6,9,10,1,5,15,14};
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; i++) {
				if(arr[j]>arr[j+1]) {
					int c=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=c;
				}
				
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+",");
			
		}
	}
}
