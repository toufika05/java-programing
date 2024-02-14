package com.theone.practice;
import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		
//		char[] name= {'p','i','y','a'};
//		for(int i=0; i<name.length; i++) {
//			System.out.println(name[i]);
//		}
//		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name: ");
		
	String name=sc.next();
	char[] ch=name.toCharArray();
	for(int i=0; i<ch.length; i++) {
		System.out.print(ch[i]+" ");
	}
	
		}
		
	
	}


