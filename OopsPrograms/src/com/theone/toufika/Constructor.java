package com.theone.toufika;

class Student{
	int id;
	String name;

	  Student(){
		System.out.println("user defined constructor");    /////constructor///////
		id=0;
		name=null;
	}
  void details(){
  	System.out.println("===object is reading===");
  	System.out.println(id);
  	System.out.println(name);
  }

}

class Constructor{
	public static void main(String[] args) {
		Student st1=new Student();
		st1.details();
	}
}
