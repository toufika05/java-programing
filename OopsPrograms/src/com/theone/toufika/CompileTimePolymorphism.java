package com.theone.toufika;

//////compile time polymorphism////////
class Cal{
static void add(int i,int j){
	System.out.println("Addition: "+(i+j));
}
static void add(double i,double j){
	System.out.println("Addition: "+(i+j));
}
}
class CompileTimePolymorphism{
public static void main(String[] args) {
	Cal.add(10,20);
	Cal.add(10.20,20.38);
}
}             
