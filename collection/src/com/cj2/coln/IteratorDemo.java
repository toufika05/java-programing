package com.cj2.coln;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

public class IteratorDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(101);
		hs.add(102);
		hs.add(103);
		hs.add(104);
	    System.out.println("====Set collection Iteration=====");
		Iterator<Integer> iterator=hs.iterator();
		while(iterator.hasNext()) {
			Integer integer1=iterator.next();
			System.out.println(integer1);
			
		}
		System.out.println();
			
			ArrayList<Integer> al=new ArrayList<Integer>();
			al.add(201);
			al.add(202);
			al.add(203);
			al.add(204);
			al.add(205);
		System.out.println("=====list collection Iteration====");	
		Iterator<Integer> itAl=al.iterator();
		while(itAl.hasNext()) {
			Integer integer2=itAl.next();
			System.out.println(integer2);
			
		}
		System.out.println(); 
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(301);
		pq.add(302);
		pq.add(303);
		pq.add(304);
		
		System.out.println("====queue collection Iteration=====");
		Iterator<Integer> itpq=pq.iterator();
		while(itpq.hasNext()) {
			Integer integer=itpq.next();
			System.out.println(integer);
			
		}
		
	}
}
 