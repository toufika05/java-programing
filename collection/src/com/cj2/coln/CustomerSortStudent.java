package com.cj2.coln;

import java.util.Comparator;

public class CustomerSortStudent implements Comparator{
	
	public int compare(Object o1, Object o2){
		Student1 st1=(Student1) o1;
		Student1 st2=(Student1) o2;
		return -(st1.getId()-st2.getId());
	}
}
