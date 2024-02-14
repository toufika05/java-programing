package com.theone;
import java.util.ArrayList;
import java.util.Arrays;

// write a java program to convert an array to an ArrayList

public class Program18 {

	public static void main(String[] args) {
		String[] str= {"Rita","Mita","Sita","Geeta","Lilia"};
		System.out.println(Arrays.toString(str));
		ArrayList<String> list=new ArrayList<String>(Arrays.asList(str));
		
		System.out.println(list);
		
		

	}

}
