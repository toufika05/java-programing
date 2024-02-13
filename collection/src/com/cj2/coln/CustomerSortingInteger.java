package com.cj2.coln;

import java.util.Comparator;

public class CustomerSortingInteger implements Comparator{
	
	public int compare(Object o1, Object o2) {
			Integer num1=(Integer) o1;
			Integer num2=(Integer) o2;
			return -(num1-num2);
	}

}
