package com.theone.practice;

import java.util.Scanner;

public class WordCountt {

	public static void main(String[] args) {
	     Scanner sc=new Scanner (System.in);
	     System.out.println(" enter the string:");
	    String str=sc.nextLine();
	    char[] ch=str.toCharArray();
	    str="";
	    int count=0;
	    for(int i=0; i<ch.length;i++) {
	    	if(ch[i]!=' ') {
	    		count++;
	    		str=str+ch[i];
	    	}
	    	else if(ch[i-1]!=' ') {
	    		str=str+"---->"+count+" ";
	    		count=0;
	    	}
	    	if(i==ch.length-1) {
	    		str=str+"--->"+count+" ";
	    	}
	    }
	    System.out.print(str);

	}

}

