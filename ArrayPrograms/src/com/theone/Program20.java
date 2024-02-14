package com.theone;

import java.util.Arrays;

// write a java program to find all the pairs of elements in an array whose sum is equal to a specified  number.

public class Program20 {
	
	public static void pairsvalue(int[] inputarray, int inputnum) {
		System.out.println("pairs of elements and their sum: ");
		
		for(int i=0; i<inputarray.length-1; i++) {
			for(int j=i+1;j<inputarray.length; j++ ) {
				if((inputarray[i]+inputarray[j])==inputnum) {
					System.out.println(inputarray[i]+" +"+inputarray[j]+"= "+inputnum);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] inputarray= {34,5,3,1,2,7,8,9,6,4,2,3,444,6,7,78};
		pairsvalue(inputarray,8);
		

	}

}
