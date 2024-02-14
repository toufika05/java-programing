package com.theone.toufika;

////====why use constructor=======//////
class Icard1{
	String name;
	final int id=101;
	String designation;


	void PrintCard(){
		System.out.println("printing card");
		System.out.println("name "+name);
		System.out.println("Id "+id);
		System.out.println("Designation "+designation);

	}
	class Constructor2{
		public void main(String[] args) {
			Icard1 c1=new Icard1();
			c1.name="toufika";
			c1.designation="cse";
			c1.PrintCard();
		}
	}

}



























