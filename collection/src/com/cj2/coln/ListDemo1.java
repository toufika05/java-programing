package com.cj2.coln;

import java.util.*;

public class ListDemo1 {

	public static void main(String[] args) {
	   Stack<Integer> s=new Stack<Integer>();///to achive type safty as well
	   s.add(10);
	   s.add(100);
	   s.add(200);
	   s.add(300);
	   
	   System.out.println(s.peek());
	   System.out.println(s);
	   
	 //  while(s.size()>0) {
	//	   System.out.println(s.pop());
		   
	//   }
	   
	  // System.out.println(s.pop());
	   //System.out.println(s.pop());
	   //System.out.println(s.pop());///fetch the top element and removed from your collection

	}

}
