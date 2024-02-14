package com.theone.practice;

public class Pattern {

	public static void main(String[] args) {
	String name=" my name is Toufika Sultana";
	char[] ch=name.toCharArray();
	     name="";
	for(int i=0; i<ch.length; i++) {
		if(ch[i]==' ') {
			name=name+ch[i-1];
		}
		else {
			name=name+ch[i];
		}
		System.out.print(ch[i]);
	}

	}

}
