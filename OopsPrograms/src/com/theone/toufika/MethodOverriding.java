package com.theone.toufika;

///////method overriding and Runtime polymorphism///////
class Father{
void decide(){
	System.out.println("sunita");
}
}
class Son extends Father{
void decide(){//// metod overriding
	System.out.println("Anita");
}
}
class MethodOverriding{
public static void main(String[] args) {
	Father f=new Father(); ////Sunita  
	//Father f=new Son();////Anita   ///up casting---->jimplicit
	//Son s=new Son(); ///Anita
	f.decide();
}

}