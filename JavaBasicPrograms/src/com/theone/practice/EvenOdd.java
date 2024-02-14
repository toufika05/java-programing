package com.theone.practice;

public class EvenOdd {

	public static void main(String[] args) {
	
		int[] num= {10,30,45,48,34,39,48};
		for(int i=0; i<=num.length; i++) {
			if(num[i]%2==0) {
				System.out.println( num[i]+"even number");
			}
			else {
				System.out.println(num[i]+"odd nuber");
			}
		}
	}
	

}
