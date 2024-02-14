package com.theone.toufika;

class WynkApp{
	static String app; //static dm
	String name;       //non static dm
	int age;
	String userid;
	WynkApp(){                                         ////constructor 
		System.out.println("user without any details"); 
	}

	WynkApp(String n, int a,String u){  //////local variables  //// overloading constructor 
		this.name=name;
		this.age=age;
		this.userid=userid;
	}
	WynkApp(String n,String u){         ////overloading constructor
		name=n;
		userid=u;
	}

	  void details(){                                   ///non static method and void return type 
		System.out.println("Welcome to "+app+" App");
		System.out.println("User name is: "+name);
		System.out.println("Age of the user: "+age);
		System.out.println("User id is: "+userid);	
	}
		void details(String s){                      ////non static method overloading and void return type 
		System.out.println("This user has subscriber this app "+s);                                 
		System.out.println("User name is: "+name);
		System.out.println("Age of the user: "+age);
		System.out.println("User id is: "+userid);
	}

	static String[] songSuggestions(){                  /////static method and string array return type and without parameter
		System.out.println("App suggests multiple song types.");
		String[] songtypes={"Party songs","Rap songs","Classical songs","soft songs"};
		return songtypes;
	}
	static String[]  rahulsChoice(String[] songs){   //////static method string return type with parameter 
		System.out.println("Rahul wants to select his favourite songs.");
		System.out.print("Rahul's selected songs are: ");
		for(int i=0; i<songs.length; i++){
			System.out.print(songs[i]+",");
		}
		return songs;
	}
}
class WynkUser{
	public static void main(String[] args) {
		WynkApp.app="Wynk";

		WynkApp u1=new WynkApp();
		u1.details();
		System.out.println();

		WynkApp u2=new WynkApp("Rohit",20,"RO123");
		u2.details();
		System.out.println();         

		WynkApp u3=new WynkApp("Suhana","iamsoha123");
		u3.details();
		System.out.println();

		WynkApp u4=new WynkApp("Ankit",23,"a7689");
		u4.details("");
		System.out.println();


       String[] songss=WynkApp.songSuggestions();
       System.out.print("The song types are: ");
           for(int i=0; i<songss.length; i++){
           System.out.print(songss[i]+",");
             }
        System.out.println();
        System.out.println();
     
         String[] songs={"Dil diya gallan","Tera hone laga hu","see you again","perfect","peaches"};
         WynkApp.rahulsChoice(songs);


	}
}
