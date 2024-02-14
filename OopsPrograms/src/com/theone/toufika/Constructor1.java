package com.theone.toufika;

//////////==========constructor overloaading=======/////////
class Icard{
String name;   //data member
int id;
String designation;

Icard(){
System.out.println("constructor without parameter");
}

Icard(String n){
System.out.println("constructor with parameter");
name=n;
}

Icard(String n, int i, String d){/////parameter is the local variable
System.out.println("constructor with parameter");
name=n;
id=i;
designation=d;
}

void PrintCard(){
System.out.println("printing card");
System.out.println("name "+name);
System.out.println("Id "+id);
System.out.println("Designation "+designation);

}
}
class Constructor1{
public static void main(String[] args) {
Icard card1=new Icard();
card1.PrintCard();
System.out.println();

Icard card2=new Icard("Jhony");
card2.PrintCard();
System.out.println();

Icard card3=new Icard("toufika",101,"cse");
card3.PrintCard();
}
}
