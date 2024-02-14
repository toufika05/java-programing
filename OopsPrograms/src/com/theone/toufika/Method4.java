package com.theone.toufika;

////method with paremeter and and using static method with class return type multiple output given
class  Account{
String name;
final Long accNo;
static Long num=3928762527819L;
Account(String n){
	name=n;
	accNo=++num;
}
void accHolder(){
	System.out.println("=====account details=======");
	System.out.println("Name "+name);
	System.out.println("Account Number: "+accNo);
}
}

class Manjot{///called class 
static void details(long number){////static void as a return type and long as an parameter
	System.out.println("get the details");
	System.out.println("Dailing... "+number);
}
static void checkNumbers(long[] numbers){
	System.out.println("checking numbers");
	for(int i=0; i<numbers.length; i++){
		System.out.println("dialing... "+numbers[i]);
	}
}

static Account createAccount(String name){
	Account ac=new Account(name);
	return ac;
}
}
class Jhony{//caller
public static void main(String[] args) {
	Manjot.details(9876543210L);///value pass as arguments

	long[] numbers={9383763747L,8987654321L,9876512340L};
	Manjot.checkNumbers(numbers);

	Account ac1=Manjot.createAccount("Toufika");
	ac1.accHolder();
	Account ac2=Manjot.createAccount("jhony");
	ac2.accHolder();
    Account ac3=Manjot.createAccount("Manjot");
	ac3.accHolder();
}

}
