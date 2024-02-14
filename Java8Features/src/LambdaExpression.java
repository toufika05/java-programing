interface A{
	
	void m();
	
}

/*
 * class B implements A{
 * 
 * @Override public void m() {
 * System.out.println("m() implemented by B implementation class ");
 * 
 * } }
 */
public class LambdaExpression {
	public static void main(String[] args) {
		
	
		/*
		 * A a=new B(); a.m();
		 */
		/*
		 * A a=new A() { public void m() { System.out.
		 * println("m() implemented by anonymouse class object of a interface"); } };
		 * a.m();
		 */
		
		/*
		 * A a=()->{//shorter way to write the code
		 * System.out.println("m() implemented by Lamda Expression"); }; a.m();
		 */
		
		A a=()->System.out.println("m() implemented by Lambda Expression");///If there is only one line of execution
		a.m();
		//Note:Lambda Expression works only for functional interface
	}

}
