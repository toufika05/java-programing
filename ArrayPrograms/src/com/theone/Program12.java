package com.theone;

import java.util.Arrays;

// write a java program to find duplicates values in an array of string values

public class Program12 {

	public static void main(String[] args) {
		String[] str= {"Aaman","Sunita","Asma","seema","Aaman"};	
		for(int i=0; i<str.length-1;i++) {
			for(int j=i+1; j<str.length; j++) {
				if((str[i].equals(str[j]))&& (i!=j)){
					System.out.println("Duplicate element is: "+str[j]);
					
				}
				
			}
		}
		

	}

}
