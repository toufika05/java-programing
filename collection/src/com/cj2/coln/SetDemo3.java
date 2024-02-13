package com.cj2.coln;
import java.util.*;

public class SetDemo3 {
	public static void main(String[] args) {
		
	Set hs=new TreeSet();///default comparable sorting order
	hs.add(20);
	hs.add(10);
	hs.add(12);
	
    System.out.println(hs);
	
	Set hs2=new TreeSet(new  CustomerSortingInteger());///customer sort comparators
	hs2.add(20);
	hs2.add(10);
	hs2.add(12);           
	System.out.println(hs2);
	
	Set set2=new TreeSet();
	set2.add("Toufika");
	set2.add("jhony");
	set2.add("manjot");
	set2.add("Azam");
	System.out.println(set2);
	
	Set set4=new TreeSet(new CustomerSortString());
	set4.add("Toufika");
	set4.add("jhony");
	set4.add("manjot");
	set4.add("Azam");
	System.out.println(set4);
	
	Student1 st1=new Student1();
	st1.setId(100);
	st1.setName("jhony");
	st1.setDept("Bsc");
	
	Student1 st2=new Student1();
	st2.setId(230);
	st2.setName("toufika");
	st2.setDept("cse");
	
	Student1 st3=new Student1();
	st3.setId(300);
	st3.setName("manjot");
	st3.setDept("btech");
	
	
	  Set stSet=new TreeSet(); 
	  stSet.add(st1);
	  stSet.add(st2);
	  stSet.add(st3);
	  System.out.println(stSet);
	  
	  Set stSet2=new TreeSet(new CustomerSortStudent()); 
	  stSet2.add(st1);
	  stSet2.add(st2);
	  stSet2.add(st3);
	  System.out.println(stSet2);
	}
}      