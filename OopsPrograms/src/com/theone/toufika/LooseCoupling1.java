package com.theone.toufika;

//========= object Utilization layer=======/////
interface PassBook{
	void withDraw(int amount);
	void deposit(int amount);
}
interface OtherBankWork{
	void link(long  aadharcard);
	void correction(String change);
}
//========object creation layer======//////
class Manage{
	static PassBook accountType(String type){
		if(type.equals("Savings")){
			return new Savings();
		}
		else if(type.equals("LoanAccount")){
			return new LoanAccount();
		}
		else{
			return null;
		}
	}
static OtherBankWork work(String type){
		if(type.equals("Savings")){
			return new Savings();
		}
		else if(type.equals("LoanAccount")){
			return new LoanAccount();
		}
		else{
			return null;
		}
	}
}
//======implementation layer======/////
class Savings implements PassBook,OtherBankWork{
	int balance=50000;
	String name="Priya Sood";
	public void withDraw(int amount){
		System.out.println((balance=balance-amount)+" remains in savings account");
	}
	public void deposit(int amount){
		System.out.println("After deposit now the balance is "+(balance=balance+amount)+" in savings account");
	}
	public void link(long aadharcard){
		System.out.println(aadharcard+" aadhar number is  link to your Savings account");
	}
	public void correction(String change){
		System.out.println(name+" name is change to "+change);
	}
}
class LoanAccount implements PassBook,OtherBankWork{
	int balance=100000;
	String  name="Nandini Kapoor";
	public void withDraw(int amount){
		System.out.println("Now you have to deposit "+(balance=balance+amount)+" in your LoanAccount");
	}
	public void deposit(int amount){
		System.out.println("Now you have to pay "+(balance=balance-amount)+" in your LoanAccount");
	}
	public void link(long aadharcard){
		System.out.println(aadharcard+" aadhar number is link to your Loan account ");
	}
	public void correction(String change){
		System.out.println(name+" name is change to "+change);
	}
}
class LooseCoupling1{ //app
	public static void main(String[] args) {
		PassBook ac=Manage.accountType("Savings");//new Oracle();
		OtherBankWork obw=Manage.work("Savings");

      System.out.println("the passbook details is:");
		ac.withDraw(10000);
		ac.deposit(20000);
		System.out.println();

      System.out.println("The other bank work details: ");
		obw.link(928938373663L);
		obw.correction("Priya Kapoor");
		
	}
} 
