package com.theone.practice;
import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		char[] ch=name.toCharArray();
		
		for(int i=0; i<ch.length;i++) {
			if(ch[i]>=65 && ch[i]<=95) {
				ch[i]=(char)(ch[i]+32);
			}
			else if(ch[i]>=97 && ch[i]<=122){
				ch[i]=(char)(ch[i]-32);
			}
			System.out.print(ch[i]);
		}
		

	}

}

