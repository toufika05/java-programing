/////=========Method Referene========//////
class Rishi{
	Rishi(){
		System.out.println("Rishi's Constructor");
	}
	void m() {
		System.out.println("Rishi's non static m() method");
	}
	 static void m1() {
		System.out.println("Rishi's static m1() method");
	}
}
interface Richa{
	void hi();
}

public class MethodRefrence {

	public static void main(String[] args) {
	   Richa r= Rishi::new;
	   r.hi();                 ////for constructor 
	  
		
	   Richa r1=new Rishi()::m; 
	   r1.hi();
		                    /////for method
	  
	  Richa r3=Rishi::m1;
	  r3.hi();

	}

}
