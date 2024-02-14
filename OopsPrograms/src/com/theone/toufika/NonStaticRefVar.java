package com.theone.toufika;

class Engine{
	String eName;  ///Turbo
	Engine(String eName){
		this.eName=eName;	
	}

	void startEng(){
		System.out.println(eName+" Engine started");
	}
}
class car{
	String cName;    ///BMW
	Engine e;    ///////non static reference variable  (Engine e=new Enigne("Turbo")  )
	car(String cName,Engine e){
		this.cName=cName;
		this.e=e;	
	}
	void driving(){
		e.startEng();   ////e.startEng(); call the method   
		System.out.println(cName+" car start moving");
	}
}
class NonStaticRefVar{
	public static void main(String[] args) {
		Engine eng1=new Engine("Turbo");
		car c1=new car("BMW",eng1);    ////if we assign a null value here the error occur 

		///c.e=eng;  /// if this is not declare the compile time error occur bcoz we didnot put a null value on eName...////...
		              ///we can also assign the value in car obj
		c1.driving();
		System.out.println();

		Engine eng2=new Engine("Power");
		car c2=new car("Maruti",eng2);
		c2.driving();
	


	}
}
