package com.theone.practice;

public class Pattern1 {

	public static void main(String[] args) {
		int row=5;
		int str=5;
		for(int i=1; i<=row; i++){
			for(int j=1; j<=str; j++){
				System.out.print("*");
			}
			System.out.println();
			str--;
		}	

	}

}
