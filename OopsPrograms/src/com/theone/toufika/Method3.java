package com.theone.toufika;

class Accunt{

    String bName;
    String name;
    int pin;
    int balance;
    Accunt(String b,String n, int p, int bal){
    	bName=b;
    	name=n;
    	pin=p;
    	balance=bal;
    }
}
class BankAccount{
static String bName;
String name;
int pin;
int balance;

void Display(){
	System.out.println("welcome to "+bName+" bank");
	System.out.println("customer name is "+name);
	System.out.println("ATM card pin is "+pin);
	System.out.println("Account balance "+balance);
}
  Accunt getDetails(){     ////non static method and class return type
   	Accunt a=new Accunt("Axis bank","Priya sood",1001,20000);
   	return a;

   
   }
}
class Method5{
public static void main(String[] args) {
    BankAccount.bName="SBI";

	BankAccount b1=new BankAccount();
	b1.name="piya";
	b1.pin=1010;
	b1.balance=10000;
	b1.Display();
	System.out.println();

	BankAccount b2=new BankAccount();
	b2.name="riya";
	b2.pin=1213;
	b2.balance=1500;
	b2.Display();
	System.out.println();

    BankAccount acc=new BankAccount(); 
	Accunt b3=acc.getDetails();
	System.out.println("here is the details of the custom  ,er b3");
	System.out.println("welcome to "+b3.bName);
	System.out.println("customer name is "+b3.name);
	System.out.println("ATM card  pin is "+b3.pin);
	System.out.println("Account balance is "+b3.balance);
	System.out.println();

   
}
}