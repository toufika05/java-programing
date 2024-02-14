package com.theone.toufika;

class  MyPrinter{
    String pName;

	MyPrinter(String pName){
		this.pName=pName;
	}
	void print(String st){
		System.out.println(pName+" Printing your : "+st);
	}
}
class Customer{	
	String cName;
	static MyPrinter p;  ///static reference variable

	Customer(String cName){
		this.cName=cName;
	}
	void printYourSt1(String st){
	    p.print(st);
		System.out.println(cName+" your printing is done");
	}
}
class Employee{	
	String eName;
	static MyPrinter e;  ///static reference variable

  Employee(String eName){
		this.eName=eName;
	}
	void printYourSt1(String st){
	    e.print(st);
		System.out.println(eName+" your printing is done");
	}
}


class StaticRefVar{
	public static void main(String[] args) {
		MyPrinter mp=new MyPrinter("Epsone");
		Customer.p=mp;
		Employee.e=mp;
		///Customer.p.print("Sometings");   //just check...it is same as the system.out.println();

		Customer c1=new Customer("Toufika");
		c1.printYourSt1("Admit card");
		System.out.println();

		Customer c2=new Customer("Jhony");
		c2.printYourSt1("Mark sheet");
		System.out.println();

		Employee e1=new Employee("Manjot");
		e1.printYourSt1("project");
 
			
	}
}
