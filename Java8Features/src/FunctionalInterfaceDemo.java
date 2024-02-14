@FunctionalInterface
interface Demo12{
	void m();///the interface that has onli one abstract metthod and annotated with @FunctionalInterface
	
	
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Demo12 d=()->System.out.println("Hi from Lambda expression");
		d.m();

	}

}
5e