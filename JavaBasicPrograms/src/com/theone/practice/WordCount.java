package com.theone.practice;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int count=0;
		str=" ";
		for(int i=0; i<=ch.length; i++) {
			if(ch[i]!=' ') {
				str=str+ch[i];
				count++;
			}
			else if(ch[i-1]!=' ') {
				str=str+"-->"+count+" ";
				count=0;
			}
			if(i==ch.length-1) {
				str=str+"-->"+count+" ";
			}
		}
		System.out.print(str);
		

	}

}
