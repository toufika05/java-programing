package com.cj2.coln;

import java.util.HashSet;
import java.util.*;


public class SetDemo0 {

	public static void main(String[] args) {
		Set set=new HashSet();
		set.add(new Integer(101));
		set.add(new Double(10.12));
		set.add(new Character('A'));
		set.add(new String("Azam"));
		System.out.println("HashSet-->"+set);//no order
		
		Set lhs=new LinkedHashSet();
		lhs.add(new Integer(101));
		lhs.add(new Double(10.12));
		lhs.add(new Character('A'));
		lhs.add(new String("Azam"));
		System.out.println("LinkedHashSet-->"+lhs);//preserve insertion order
		
		Set ts=new TreeSet();
	    ts .add(new Integer(10));///element/object must be comparable type or same type
		ts.add(new Integer(11));
		ts .add(new Integer(9));
		System.out.println("TreeSet-->"+ts);//ascending/decending order

	}

}
