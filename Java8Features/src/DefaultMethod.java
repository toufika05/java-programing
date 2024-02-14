interface Azam{
	void m1();
	void m2();
	void m3();
	default void m4() {  ////concrete method allowed in interface after jdk 8 version as a default method
		System.out.println("m4() common logic implemented by Azam");
	}
	default void m5() {
		System.out.println("m5() common logic implemented by Azam");
	}
}
class Toufika implements Azam{
	@Override
	public void m1() {
		System.out.println("m1() is implemented by Toufika");
		
	}
	@Override
	public void m2() {
		System.out.println("m2() is implemented by Toufika");
		
	}
	@Override
	public void m3() {
		System.out.println("m3() is implemented by Toufika");
		
	}
}
	class Jhony implements Azam{
		@Override
		public void m1() {
			System.out.println("m1() is implemented by Jhony");
			
		}
		@Override
		public void m2() {
			System.out.println("m2() is implemented by Jhony ");
			
		}
		@Override
		public void m3() {
			System.out.println("m3() is implemented by Jhony");
			
		}
	
	
}
	
public class DefaultMethod {

	public static void main(String[] args) {
		Azam a=new Toufika();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		a.m5();
	}
}	


