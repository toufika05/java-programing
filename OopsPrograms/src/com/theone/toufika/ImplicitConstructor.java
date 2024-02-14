package com.theone.toufika;

class Amol{
	int i=10;
	Amol(){
		System.out.println("Amol is constructor of class Amol");  ////execute  in 1st position
	}
	void m1(){
		System.out.println("Hello m method of class Amol");
	}
}

class Bimal extends Amol{  
	int j=20;
	Bimal(){
		System.out.println("Bimal is constructor of class Bimal");   ////execute in  2nd position
	}
	void m2(){
		System.out.println("Hello m2 method of class Bimal");
	}
}

class Detol extends Bimal{
	int l=59;
	Detol(){
		System.out.println("Detol is constructor of class Detol");/////execute in  3rd position position
	}
	void m4(){
		System.out.println("Hello m4 method of class Detol");
	}
}
class ImplicitConstructor{
	public static void main(String[] args) {
		new Detol();
	}
}



 




