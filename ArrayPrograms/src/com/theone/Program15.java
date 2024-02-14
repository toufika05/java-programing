package com.theone;

import java.util.Arrays;

// Singleton

class Singleton{
	
	static Singleton st;
	public static Singleton getSingleton(){
		if(st==null) {
			st=new Singleton();
		}
		return st;
		
	}
}
class Program15{
	public static void main(String[] args) {
		Singleton st1=Singleton.getSingleton();
		Singleton st2=Singleton.getSingleton();
		System.out.println(st1);
		System.out.println(st2);
	}
}
