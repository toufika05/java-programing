package com.theone.toufika;

class Member{
	String mName;
	String gName;
	void chat(){
		System.out.println(mName+" chatting in group "+gName);
	}
}
class Admin extends Member{
	void addUser(){
		System.out.println(mName+" added another member to "+gName);
	}
}
class ClassCastException{
	public static void main(String[] args) {
		System.out.println("Program start...");

		Member mem=new Admin(); 
		mem.mName="	Toufika";
		mem.gName="CJ2";
		mem.chat();
		if(mem instanceof Admin){
         Admin ad=(Admin)mem;////without perform up cast if you try to perform downcast then you will get ClassCastException
		  ad.addUser();
		}
		System.out.println("Program end...");
	}
}  
