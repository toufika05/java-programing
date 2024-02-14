package com.theone.toufika;

class Employee{
	static String cName;
	int id;
	String name;
	int salary;

	void PrintDetails(){
		System.out.println("company name "+cName);
		System.out.println("Employee id is "+id);
		System.out.println("Employee name is "+name);
		System.out.println("Employee salary is "+salary);
	}

}
class Demo{
	public static void main(String[] args) {
		System.out.println("this is our custom class");

		Employee.cName="Infosys";

		Employee e1=new Employee();
		e1.id=12;
		e1.salary=30;
		e1.name="Toufika";
		e1.PrintDetails();
		System.out.println();

       Employee e2=new Employee();
		e2.id=13;
		e2.salary=30;
		e2.name="Jhony";
		e2.PrintDetails();
		System.out.println();


		Employee e3=new Employee();
		e3.id=14;
		e3.salary=30;
		e3.name="Manjot";
		e3.PrintDetails();
		System.out.println();



	}
}
