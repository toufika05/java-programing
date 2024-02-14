package com.theone.practice;

public class P3 {
	public static void main(String[] args) {
		
		String name="sULTana";
		char[] ch=name.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(i==0) {
				if(ch[i]>=97 && ch[i]<=122) {
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














