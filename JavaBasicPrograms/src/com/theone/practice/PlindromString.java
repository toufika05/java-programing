package com.theone.practice;

public class PlindromString {

	public static void main(String[] args) {
		String name="abba";
		String output="";
		
		for(int i=name.length()-1; i>=0; i--){
			output=output+name.charAt(i);
			
		}
		if(name.equals(output)) {
			System.out.println(output+" is palindrom string");
		}
		else {
			System.out.println(output+" is not palindrom string");
		}
		

	}

}
