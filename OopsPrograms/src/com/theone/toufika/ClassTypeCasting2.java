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
class ClassTypeCasting2{
	public static void main(String[] args) {
		//Member mem=new Member();
		////if aisa krte to sirf Member class  me  hi mName  aur gName
          //store hota Admin me mName=null aur gNmane=Null  ho jata 

		Member mem=new Admin();///up casting---> implicit   
		mem.mName="Toufika";
		mem.gName="CJ2";
		mem.chat();

       /// Admin ad=new Admin();
		Admin ad=(Admin)mem;///down casting--->explicit   
		ad.addUser();
	}
}
