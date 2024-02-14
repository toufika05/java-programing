package com.theone.toufika;

class Dingaaaa{
	String name;
		{
		System.out.println("non static block 1 of linga class");////non static block
		name="Dinga";	
	}
	

	Dingaaaa(){
		System.out.println("dinga constructor executed");/////constructor
		System.out.println(name);
	}
			{
		System.out.println("non static block 2 of linga class");/////non static block
          name="MOUNI";
	}
}
class NonStaticBlock{
	public static void main(String[] args) {
		System.out.println("Main method non static Block class");
		Dingaaaa d1=new Dingaaaa();
		Dingaaaa d2=new Dingaaaa();
	}
}
