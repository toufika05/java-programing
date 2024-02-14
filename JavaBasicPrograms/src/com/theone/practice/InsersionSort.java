package com.theone.practice;

public class InsersionSort {

	public static void main(String[] args) {
int[] arr= {2,3,8,5,1,69,45,6,4};
		
		for(int i=1; i<arr.length; i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+",");
		}

	}

}
