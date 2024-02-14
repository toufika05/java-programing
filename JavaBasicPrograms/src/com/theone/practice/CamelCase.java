package com.theone.practice;
import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		  	Scanner sc=new Scanner(System.in);
		  	System.out.println("enter a string: ");
		  	String name=sc.nextLine();
		  	char[] ch=name.toCharArray();
		  	for(int i=0; i<ch.length;i++) {
		  		if(i==0||ch[i-1]==' ') {
		  			if(ch[i]>=97 &&ch[i]<=122) {
		  				ch[i]=(char)(ch[i]-32);
		  			}
		  			
		  		}
		  		else if(ch[i]>=65 && ch[i]<=90) {
		  			ch[i]=(char)(ch[i]+32);
		  		}
		  		System.out.print(ch[i]);
		  	}
		  	
		  	
		  	
		  	}
		  }    










