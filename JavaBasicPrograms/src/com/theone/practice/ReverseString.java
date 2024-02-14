package com.theone.practice;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String name=sc.nextLine();
		String reversedStr=" ";
		for(int i=name.length()-1; i>=0; i--) {
			reversedStr=reversedStr+name.charAt(i);
		}
		System.out.println("Original String: "+name);
		System.out.println("Reverse of giving string:"+reversedStr);

	}

}
