package com.cj2.coln;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class collectionDemo {
	public static void main(String[] agrs) {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;// 50
		arr[2] = 30;
		arr[3] = 40;
		// arr[4]=12.21;
		System.out.println("before add new element: " + Arrays.toString(arr));

		int c = arr[1];// 20
		arr[1] = 50;
		arr[4] = arr[3];
		arr[3] = arr[2];
		arr[2] = c;
		System.out.println("after add new element: " + Arrays.toString(arr));

		ArrayList col=new ArrayList();
		 col.add(10);//0
		 col.add(20);//1
		 col.add(30);//2
		 col.add(12.30);//3
		 System.out.println("before add new element: "+col);
		 col.add(1.50);
		 System.out.println("after add new element: "+col);
		  
	}

}
