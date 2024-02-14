package com.theone;

import java.util.ArrayList;
import java.util.Arrays;

// write a java program to convert an ArrayList to an array

public class Program19 {

	public static void main(String[] args) {
   ArrayList<String> list=new ArrayList<String>();
   list.add("python");
   list.add("java");
   list.add("php");
   list.add("c++");
   
   String[] str=new String[list.size()];
   list.toArray(str);
   for(String string: str) {
	   System.out.print(string+",");
   }
   
		

	}

}
