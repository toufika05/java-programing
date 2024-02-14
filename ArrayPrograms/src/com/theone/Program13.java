package com.theone;

import java.util.Arrays;

// write a java program to find common elements btn two arrays(String values)

public class Program13 {

	public static void main(String[] args) {
		String[] names= {"Sima","sara","sama","zara"};
		String[] str= {"Suli","ata","mita","sara","mita","sama"};
		
		for(int i=0; i<names.length-1; i++) {
			for(int j=i+1; j<str.length; j++) {
			if(names[i].equals(str[j])) {
				System.out.println("Common element between two arrays is: "+str[j]);
			}
			}
			
		}
		

	}

}
