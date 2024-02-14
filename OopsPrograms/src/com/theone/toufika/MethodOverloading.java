package com.theone.toufika;

//////Method overloading/////    

class Calculator{
static void add(int n1,int n2){
	int s=n1+n2;
	System.out.println("Addition: "+s);
}

static void add(int n1,int n2,int n3){
	int s=n1+n2+n3;
	System.out.println("Addition: "+s);
}

static void add(double n1,double n2){
	double s=n1+n2;
	System.out.println("Addition: "+s);
}
}
class TestCalculator{
public static void main(String[] args) {
	Calculator.add(10,20);
	Calculator.add(18,20,38);
	Calculator.add(19.20,29.3);
}
}
