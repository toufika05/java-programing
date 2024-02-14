package com.theone.toufika;

class DataTypeCasting{
	public static void main(String[] args) {
		///wide casting////
		byte b1=10;
		short s1=b1;  ////implicit
		//short s1=(short)b1;  ////explicit
		System.out.println(s1);

//////////narrow casting///////
		//if we take big number value then loss happens
		//short s2=10000;
	     short s2=10;
		byte b2=(byte)s2;  /////explicit
     //if  byte b2=s2; //then it shows errors///
		System.out.println(b2);
	}
} 
