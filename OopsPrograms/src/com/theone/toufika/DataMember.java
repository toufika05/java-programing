package com.theone.toufika;

class Employee{
   	static String cName; /////Static data member
   	      String eName;  /////non static data member
   	      int eId;      //////non static data member

        void details(){
        	System.out.println("===employee card details===");
        	System.out.println("company name "+cName);
        	System.out.println("Employee name "+eName);
        	System.out.println("Employee id "+eId);
        }
   }

   class DataMember{
   	public static void main(String[] args) {
   		Employee.cName="Infosys";   ///////call one time

   		Employee e1=new Employee();
   		e1.eName="Toufika";
   		e1.eId=101;
   		e1.details();

   		Employee e2=new Employee();
   		e2.eName="Jhony";
   		e2.eId=102;
   		e2.details();

     	Employee e3=new Employee();
   		e3.eName="Manjot";
   		e3.eId=103;
   		e3.details();

   	}
   }
