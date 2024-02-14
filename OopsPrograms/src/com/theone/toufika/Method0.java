package com.theone.toufika;

///////////using static//////////
class Factorial{
static int fact(int num){   /////static
int fact=1;
for(int i=1; i<=num; i++){
	fact*=i;
}
System.out.println(num+" fact value is "+fact);
return fact;
}
}
class Method0{
public static void main(String[] args) {
//Factorial f=new Factorial();
//int fact=f.fact(5);       /////for non static//////

int fact=Factorial.fact(5);
System.out.println("half of the factorial value is "+(fact/2));
}
}

