package com.cj2.coln;

import java.util.ArrayList;

public class ForEachDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(110);
		al.add(120);
		al.add(130);
		al.add(140);
		
		/*
		 * for(Integer integer : al) { System.out.println(integer);//for each only works
		 * in forward iteration only and no manioulation }
		 */
     
		Object[] array= al.toArray();
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		
	}

}
