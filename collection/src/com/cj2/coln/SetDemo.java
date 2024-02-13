package com.cj2.coln;

import java.util.HashSet;
import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		Set hs=new HashSet();
		boolean st=hs.add(new Integer(101));
		System.out.println("101 added: "+st);
		hs.add(new Double(10.12));
		hs.add(new Character('A'));
		hs.add(new String("Azam"));
		st=hs.add(new Integer(101));
		System.out.println("Another 101 added: "+st);
		System.out.println("HashSet-->"+hs);///no order

	}

}
