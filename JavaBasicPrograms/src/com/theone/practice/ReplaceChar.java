package com.theone.practice;
import java.util.Scanner;

public class ReplaceChar {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string: ");
	String name=sc.next();
	char[] ch=name.toCharArray();
	
	System.out.println("Enter the replace charecter: ");
	String st=sc.next();
	char[] c=st.toCharArray();
	
	name=" ";
	for(int i=0; i<ch.length; i++) {
		if(ch[i]==c[0]) {
			name=name+"qu";
		}
		else {
			name=name+ch[i];
		}
	}
	System.out.println(name);
	
	
	}

}
