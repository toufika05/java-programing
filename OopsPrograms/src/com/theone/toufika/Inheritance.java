package com.theone.toufika;


class A{  ////grandparent class /////dadaji
	int i=10;
	void m1(){
		System.out.println("Hello m method of class A");
	}
}

class B extends A{  //parent class  ////pitaji      /////single s
	int j=20;
	void m2(){
		System.out.println("Hello m2 method of class B");
	}
}
class C extends B{  ///child class    /////multilevel inheritance   ////me
	int k=40;
	void m3(){
		System.out.println("Hello m3 method of class C");
	} 

}
class D extends A {   /////hierarchical  ///chachaji
	int l=59;
	void m4(){
		System.out.println("Hello m4 method of class D");
	}
}

class Inheritance{
	public static void main(String[] args) {
		C c=new C();
		System.out.println(c.i);
		System.out.println(c.j);
		System.out.println(c.k);
		c.m1();
		c.m2();
		c.m3();

		D d=new D();
		System.out.println(d.i);
		System.out.println(d.l);
        d.m1();
        d.m4();
	}   

}
