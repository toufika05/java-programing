interface Azam1{
	void m1();
	void m2();
	void m3();
	default void m4() {
		System.out.println("m4() common logic implemented by Azam");
	}
	default void m5() {
		System.out.println("m5() common logic implemented by Azam");
	}
	static void m6() {
		System.out.println("static method m6() of an interface");
	}
}
class Toufika1 implements Azam1{
	public void m1() {
		System.out.println("m1() method is implemented by Toufika");
	}
	public void m2() {
		System.out.println("m2() method is implemented by Toufika");
	}
	public void m3() {
		System.out.println("m3() method is implemented by Toufika");
	}
	
}

class Jhony1 implements Azam1{
	public void m1() {
		System.out.println("m1() method is implemented by Jhony");
	}
	public void m2() {
		System.out.println("m2() method is implemented by Jhony");
	}
	public void m3() {
		System.out.println("m3() method is implemented by Jhony");
	}
	
}

public class StaticMethod {

	public static void main(String[] args) {
		Azam1.m6();
		
		
		Azam1 a=new Jhony1();
		a.m1();
		a.m2();
		a.m3();
        a.m4();
        a.m5();
	}

}
