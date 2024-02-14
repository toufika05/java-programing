package com.theone.toufika;

class SuperClass{
	String name="Manjot";
	void m1(){
		System.out.println("m1() is method of superclass");
	}
}
class SubClass extends SuperClass{
	int i=10;
	void m2(){
		System.out.println("m2() is method of subclass");
	}
}
class ClassTypeCasting{
	public static void main(String[] args) {
		SuperClass sup=new SubClass();/////up casting---> implicit
		System.out.println(sup.name);
		sup.m1();

		
       //if  Subclass sub=sup;  then error show/////
		SubClass sub=(SubClass)sup;//////down casting--->explicit
		System.out.println(sub.name);
		System.out.println(sub.i);
		sub.m1();
		sub.m2();
	}   
}
