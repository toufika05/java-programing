package com.cj2.coln;
import java.util.*;

public class ListDemo2 {

	public static void main(String[] args) {
		List<Integer> arrlist=new ArrayList<Integer>();
		arrlist.add(100);
		arrlist.add(200);
		arrlist.add(300);
		arrlist.add(400);
		arrlist.add(1,500);//takes more time
		System.out.println(arrlist);
		
		
		List<Integer> linklist=new LinkedList<Integer>();
		linklist.add(100);
		linklist.add(200);
		linklist.add(300);
		linklist.add(400);
		linklist.add(1,500);///takes less time 
		System.out.println(linklist);

		
		

	}

}
