package com.theone.toufika;

class MyBean{     
	private String userName;
	private String password;
	private int age;
	private int id;
	/*void print(){
		System.out.println("details of Mybean object");
		System.out.println(userName);
		System.out.println(password);
		System.out     System.out.println(id);
	}*/

	public void setUserName(String userName){
		//here we can validate or write some other logic
		this.userName=userName;
		System.out.println("data set to the userName");
	}
	public String getUserName(){
		return userName;
	}


	public void setPassword(String password){
		//here we can validate or write some other logic
	     if(password.length()>=8){
	     	this.password=password;
	     	System.out.println("data set to the password");
	     }  
	     else{
	     	System.out.println("password length must minimum 8 Character");
	     }
	}
	public String getPassword(){
		return password;
	}


	public void setAge(int age){
		//here we can validate or write some other logic
		if(age>=18){
			this.age=age;
			System.out.println("data set to the age");
		}
		else{
			System.out.println("age is under 18,so you are not allowed");
		}
	}
	public int getAge(){
		return age;

	}


	public void setId(int id){
		//here we can validate or write some other logic   
		if(id>100){
			this.id=id;
			System.out.println("data set to the Id");
		}
		else{
			System.out.println("please enter above 100");
		}
	}
	public int getId(){
		return id;
	}

}
class Encapsulation{
	public static void main(String[] args) {
		MyBean mb=new MyBean();
		System.out.println("==set data===");
		mb.setUserName("jhony");
		mb.setPassword("hackthis1");
		mb.setAge(21);
		mb.setId(101);
	   //	mb.print();

		System.out.println("====get data====");
		System.out.println(mb.getUserName());
		System.out.println(mb.getPassword());
		System.out.println(mb.getId());
		System.out.println(mb.getAge());
	

		///System.out.println("After changing the data");
		//mb.setUserName("jhony gaddar");
		//mb.setPassword("hackthis12342");
		//mb.setAge(-21);
		//mb.setId(10);
		//mb.print();
	//	System.out.println();

		//mb.print();

      
	}
}
