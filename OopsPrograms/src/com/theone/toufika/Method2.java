package com.theone.toufika;

class Fur{
    String mName;
    String sName;
    int stNum;
    String fName;
    Fur(String m,String s, int n, String f){
    	mName=m;
    	sName=s;
    	stNum=n;
    	fName=f;
    }
}   
class Furniture{
    static String mName;  //static dm
     String sName;        //non static dm
     int sNum;
     String fName;

    void details(){      /////non static method 
	System.out.println("The Market name is "+ mName);
	System.out.println("The Store name is "+ sName);
	System.out.println("The store number is "+sNum);
	System.out.println("customer buy "+ fName);
}
   static Fur getFur(){     ////static method  and class return type       
   	Fur f=new Fur("Boro Bazar","Pottery barn",104,"single bed");
   	return f;
   }

   static String nameofMarket(){  ///static method and string return type
   	System.out.println("market name is New Market");
   	return "New Market";
   }
   static int[] storeNumbers(){ /////static method and int return type
	System.out.println("Number of the stores");
	int[] numbers ={101,102,102,104,105};
	return numbers;	
}


}
class Customer{
public static void main(String[] args) {
	Furniture.mName="Banjara Market"; 

	Furniture c1=new Furniture();
	c1.sName="FURNITURE SHOWROOM";
	c1.sNum=101;
	c1.fName="rocking chair";
	c1.details();
	System.out.println();

	Furniture c2=new Furniture();
	c2.sName="PEPPER POT";
	c2.sNum=102;
	c2.fName="sofa set";
	c2.details();
	System.out.println();

	Fur c3=Furniture.getFur();
	System.out.println("here is the details of the customer c3");
	System.out.println("The Market name is "+c3.mName);
	System.out.println("The Store name  is "+c3.sName);
	System.out.println("The store Number  is "+c3.stNum);
	System.out.println("customer buy "+c3.fName);
	System.out.println();

	String nameofMarket=Furniture.nameofMarket();
	System.out.println("we are going to "+nameofMarket);
	System.out.println();


   int[] storeNum=Furniture.storeNumbers();
       for(int i=0; i<storeNum.length; i++){
       System.out.println("The store number is "+storeNum[i]);
         }

}
}	