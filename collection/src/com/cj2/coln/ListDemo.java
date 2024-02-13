package com.cj2.coln;

import java.util.Iterator;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		  Vector<Integer> v =new Vector<Integer>();///by using genarics: advantage is no need of type casting and it helps to achive type safety as well
		  v.add(10);//integer object
		//  v.add(10.12);///Double object
		  v.add(100);
		  v.add(200);
		  
		  
		  Iterator<Integer> it = v.iterator();///returns implementation class object of iterator interface
		  
		  while(it.hasNext()){///boolean true if element is present
			 // Object obj=it.next();//return the object present in collection as a next element
			  //Integer iobj=(Integer) obj;
			  
			  Integer iobj=it.next();///no need to perform up or down cast
			  int i=iobj.intValue();
			  System.out.println(i);
		  }

	}
}

