package com.theone.toufika;

class Girl{
	String name;
	String father;
	long phone;
	String address;
	Girl(String n, String f, long p, String a){
		name=n;
		father=f;
		phone=p;
		address=a;
	}
   }

class Manjot{
	static void details(){ ///static and void as return type
		System.out.println("name of the girl name is alia");
		System.out.println("name  of the father name is Mahesh");
		System.out.println("job actress");
	}

	static long getNumber(){  ///static and primitive as return type
		System.out.println("number is 7980299168");
		return 7980299168L;
	}

	static long[] getNumbers(){////static and array as a return type
		System.out.println("manjot share multiple phone numbers");
		long[] numbers ={2890186389L,9276836890L,9727820990L};
		return numbers;	
	}

	static Girl getGirl(){ ////static and class as a return type,return multiple value same type
		Girl g=new Girl("alia", "Mahesh", 7980299168L,"Mumbai");
		return g;
		
	}
}
class Jhony{
	public static void main(String[] args) {
		Manjot.details();

		long phone=Manjot.getNumber();////7880299168L
		System.out.println("Dailing number is "+phone);

		long[] girlsNumbers=Manjot.getNumbers();  /////{2890186389L,9276836890L,9727820990L};
		for(int i=0; i<girlsNumbers.length; i++){
			System.out.println("Dial number "+girlsNumbers[i]);
		}

			Girl meye=Manjot.getGirl();
			System.out.println("here is the details of the girls");
			System.out.println(meye.name);
			System.out.println(meye.father);            
			System.out.println(meye.phone);
			System.out.println(meye.address);

		}

	}    
