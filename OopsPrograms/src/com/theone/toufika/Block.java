package com.theone.toufika;

/////why use block//////
class Dinga{
String name;
static  int count;

Dinga(String name){  ////parameterized constructor
	this.name=name;
}
Dinga(){  /////non parameterized constructor

}
{
	System.out.println("objects are being created"); ////non static block
	count++;
}

}
class Block{
public static void main(String[] args) {
	System.out.println("Main method block class");
	 new Dinga("Dinga");
	 new Dinga("Dinga");
	 new Dinga("Dinga");
	 new Dinga("Dinga");
	 new Dinga("Dinga");
	 new Dinga("Dinga");
	 new Dinga("Dinga");
	 new Dinga("Dinga");
	 new Dinga("Dinga");
	 new Dinga("Dinga");
	 new Dinga("Dinga");
	 new Dinga("Dinga");
	 new Dinga("Dinga");
	 new Dinga();
	 new Dinga();
	 new Dinga();
     new Dinga();
     new Dinga();
     new Dinga();
     System.out.println(Dinga.count);

}
}
