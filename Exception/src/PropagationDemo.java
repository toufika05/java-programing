
public class PropagationDemo {
   static void m() {
	   System.out.println("m() starts...");
	   System.out.println(10/0);///throw new ArithmeticException()
	   System.out.println("m() ends...");
   }
	public static void main(String[] args) {
		System.out.println("program starts..");
        m();
        System.out.println("program ends...");
	}

}
