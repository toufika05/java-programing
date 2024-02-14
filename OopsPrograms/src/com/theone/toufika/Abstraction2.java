package com.theone.toufika;

interface Demoo{
	int i=10;////by default it will be public static and final

	void m1();////by default it will be public and abstract
   public abstract void m2();
}
class InterfaceImple implements Demoo{
	public void m1(){
		System.out.println("m1() implemented by InterfaceImple");
	}
	public void m2(){
		System.out.println("m2() implemented by InterfaceImple");
	}     
}
class Abstraction2{
	public static void main(String[] args) {
		System.out.println(Demoo.i);
		Demoo di=new InterfaceImple();
		di.m1();
		di.m2();

	}
}
