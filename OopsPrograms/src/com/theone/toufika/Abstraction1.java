package com.theone.toufika;


	abstract class Demo{
		static int i=10;
		int j=20;
		Demo(){
			System.out.println("Constructor of Demo");
		}
		void m1(){
			System.out.println("m1() method of Demo");
		}
		abstract void m2();
	}
	class DemoImple1 extends Demo{
		DemoImple1(){
			super();
			System.out.println("Constructor of DemoImple1");
		}

		void m2(){
			System.out.println("m2() implementes by DemoImple1w");
		}
	}
	class DemoImple2 extends Demo{
		DemoImple2(){
			super();
			System.out.println("Constructor of DemoImple2");
		}

		void m2(){
			System.out.println("m2() implementes by DemoImple");
		}
	}
	class Abstraction1{
		public static void main(String[] args) {
			System.out.println(Demo.i);
			Demo d=new DemoImple1();
			System.out.println(d.j);
			d.m1();
			d.m2();

			Demo d2=new DemoImple2();
			System.out.println(d2.j);
			d2.m1();
			d2.m2();
		}
	}


