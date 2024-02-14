package com.theone.practice;
import java.util.Scanner;

public class UpperCaseLowerCase {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string: ");
	String str=sc.nextLine();
	char[] ch=str.toCharArray();
	for(int i=0; i<ch.length; i++) {
		if(ch[i]>=65 && ch[i]<=90) {
			ch[i]=(char) (ch[i]+32);
		}
		else {
			ch[i]=(char)(ch[i]-32);
		}
		System.out.print(ch[i]);
	} 

	
	

	}

}
