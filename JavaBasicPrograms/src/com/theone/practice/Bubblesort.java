package com.theone.practice;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
      int[] arr= {2,3,85,6,9,5,7,6};
      
        for(int i=0; i<arr.length; i++) {
        	for(int j=i+1; j<arr.length; j++) {
        		if(arr[i]>arr[j]) {
        			int c=arr[i];
        			arr[i]=arr[j];
        			arr[j]=c;
        		}
        	}
        }
        for(int i=0; i<arr.length; i++) {
        	System.out.print(arr[i]+",");
          
        }

}
	  }