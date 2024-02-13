package com.cj2.coln;

import java.util.*;

public class SetDemo2 {
	public static void main(String[] args) {
		Student st1=new Student();
		st1.setId(101);
		st1.setName("jhony");
		st1.setDept("Bsc");
		System.out.println(st1.hashCode());
		
		Student st2=new Student();
		st2.setId(102);
		st2.setName("toufika");
		st2.setDept("cse");
		System.out.println(st2.hashCode());
		
		Student st3=new Student();
		st3.setId(101);
		st3.setName("jhony");
		st3.setDept("Bsc");
		System.out.println(st2.hashCode());
		
		System.out.println(st1.equals(st3));
		
		
		Set hs=new HashSet();
		hs.add(st1);
		hs.add(st2);
		hs.add(st3);
		System.out.println(hs);
		
	}
}
