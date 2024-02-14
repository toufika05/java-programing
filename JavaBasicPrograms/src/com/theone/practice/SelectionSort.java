package com.theone.practice;


public class SelectionSort {

	public static void main(String[] args) {
		
	int[] arr= {2,3,8,5,1,69,45,6,4};
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				{
					if(arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						
						
					}
				}
			}
		}
		
		System.out.println("Now the array after sorting: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" "); 
		}

	}

}
