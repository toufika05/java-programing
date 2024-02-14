package com.theone.toufika;

class Demo1{  ///default modifier or package level modifier
	int age;

	Demo1(int i){
		System.out.println("constructor executed");
	      age=i;

	}

	//after copile the demo class
	//Demo(){
		//System.out.println("constructor executed");
	//}
}
class Constructor0{
	public static void main(String[] args) {
		Demo1 d=new Demo1(10);
		System.out.println(d.age);

	}
}

