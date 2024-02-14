package com.theone.toufika;

/////multiple inheritance======//////
interface A{
void decide();
}

interface P1 extends A{///interface to interface extends
void decide();
}

interface  P2 extends A{
void decide();
}

class C implements  P1,P2{///class to interface implements
public void decide(){
	System.out.println("Katrina");
}

}
class Abstraction3{
public static void main(String[] args) {
	A a=new C();
	a.decide();
}
}
