package com.theone.toufika;

class Amol{
	int i;
	Amol(int i){
		this.i=i;
		System.out.println("Amol is constructor of class Amol");  ////execute  in 1st position
	}
	void m1(){
		System.out.println("Hello m method of class Amol");
	}
}

class Bimal extends Amol{  
	int j;
	Bimal(int j){

		super(10);

		this.j=j;
		System.out.println("Bimal is constructor of class Bimal");   ////execute in  2nd position
	}
	void m2(){
		System.out.println("Hello m2 method of class Bimal");
	}
}

class Detol extends Bimal{
	int k;
	Detol(int k){

		super(20);

		this.k=k;
      System.out.println("Detol is constructor of class Detol");/////execute in  3rd position position
	}
	void m4(){
		System.out.println("Hello m4 method of class Detol");
	}
}
class ExplicitConstructor{
	public static void main(String[] args) {
		Detol d= new Detol(30);
		System.out.println(d.i);
		System.out.println(d.j);
		System.out.println(d.k);
		d.m1();
		d.m2();
		d.m4();
	}
}

