package com.cj2.coln;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(110);
		al.add(120);
		al.add(130);
		al.add(140);
		
		ListIterator<Integer> listiterator=al.listIterator();
		System.out.println("===forward direction======");
	   while(listiterator.hasNext()) {
		   Integer integer=listiterator.next();
		   System.out.println(integer);
	   }
	   System.out.println("====backward direction====");
	   while(listiterator.hasPrevious()) {
		 Integer integer=listiterator.previous();
		 System.out.println(integer);
		
	   }

	}

}
