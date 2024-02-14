package com.theone;

import java.util.Arrays;

////write a java program to sort a numeric array and a string array     

public class Program1 {
	
	public static void main(String[] args){
	    int[] num= {2,5,45,32,12,34,76,78,54,4,10};
	   // char[] cg= {'A','B','C'};
	    String[] arr= {"piya","Riya","Aita","Mita"};
	    System.out.println("Original numaric array: "+Arrays.toString(num));
	    Arrays.sort(num);
	    System.out.println("sorted numaric array: "+Arrays.toString(num));
	   
	    System.out.println("Original String array: "+Arrays.toString(arr));
	    Arrays.sort(arr);
	    System.out.println("Sorted String array: "+Arrays.toString(arr));
	      		
	    }
	
}

