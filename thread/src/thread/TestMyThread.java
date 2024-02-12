package thread;

public class TestMyThread {

	public static void main(String[] args) {
		MyThread m1=new MyThread();
		m1.start();
		
		MyThread2 m2=new MyThread2();
		m2.start();
		
		

	}

}
