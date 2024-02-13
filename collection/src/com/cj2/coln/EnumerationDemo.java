package com.cj2.coln;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector<Integer> vec=new Vector<Integer>();
		vec.add(100);
		vec.add(200);
		vec.add(300);
		vec.add(400);
		
		Enumeration<Integer> enumeration=vec.elements();
		while(enumeration.hasMoreElements()) {
			Integer integer=enumeration.nextElement();
			System.out.println(integer);
		}
		

	}

}
