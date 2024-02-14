package com.theone.practice;

public class Pattern2 {
	public static void main(String[] args) {
		int row=10;
		int str=1;
		int num=1;
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=str; j++) {
				System.out.print(num+" "); 
				num++;
			}
			System.out.println();
			str++;
		}
			
	}

}
