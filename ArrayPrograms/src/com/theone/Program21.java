package com.theone;

import java.util.Arrays;

// write a java program to find a missing number in an array  

public class Program21 {

	public static void main(String[] args) {
		int[] nums= {5,4,7,9,1,2,8,6};
		int totalnum=9;
		int expectednum=totalnum*((totalnum+1)/2);
		int num=0;
		for(int i:nums) {
			num=num+i;
		}
		
        System.out.println(expectednum-num);
	}

}
