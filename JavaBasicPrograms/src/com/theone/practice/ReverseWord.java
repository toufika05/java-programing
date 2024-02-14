package com.theone.practice;
import java.util.Scanner;


public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=sc.nextLine();
		char[] ch=str.toCharArray();

		String temp="";
		str="";
		for(int i=0; i<ch.length; i++){
			if(ch[i]!=' '){   
				temp=temp+ch[i];
			}
			else if(ch[i-1]!=' '){
				str=temp+" "+str;
				temp=" ";			
				  }

			if(i==ch.length-1){
				str=temp+" "+str;
			}
			}
			System.out.print(str);
	}
}  
