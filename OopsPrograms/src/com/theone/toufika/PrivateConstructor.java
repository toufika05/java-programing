package com.theone.toufika;

///////======Private constructor======///gt   

class Pcons{

Pcons(){

}

void display(){
	System.out.println("display() method call");
}
}

class PrivateConstructor{
public static void main(String[] args) {
	Pcons pc=new Pcons();
	pc.display();
}
}
