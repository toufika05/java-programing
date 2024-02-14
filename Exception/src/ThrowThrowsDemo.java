class AgeNotValidException extends Exception{///custom exceotion checked exception
	public AgeNotValidException(String msg) {
		super(msg);
	}
}
public class ThrowThrowsDemo {
   static void formfill() {
	 System.out.println("form is being fill up");
   }
   static boolean ageValidation(int b) throws AgeNotValidException{///called
	   System.out.println("Age validation is on process");
	   if(b>=18) {
		   System.out.println("Age is valid");
		   return true;
	   }else {
		   throw new ArithmeticException("Boss can't devided by 0");///throw keyword use
	   }
   }
   static void generateLicense() {
	   System.out.println("License is being generated");
   }
	public static void main(String[] args) {//caller
	   System.out.println("program starts...");
	  formfill();
	  boolean res=false;
	  try {
		  res=ageValidation(10);
	  }catch(AgeNotValidException e) {
		  e.printStackTrace();
	  }
	  
	  System.out.println("status: "+res);
     generateLicense();
     System.out.println("program ends..");
	
	}


}

