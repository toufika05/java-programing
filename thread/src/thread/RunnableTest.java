package thread;

public class RunnableTest {

	public static void main(String[] args) {
	MyRunnable mr= new MyRunnable();//step 3
	
	Thread th1= new Thread(mr);//step 4
	 th1.start();//step 5
	
	Thread th2= new Thread(mr);
	th2.start();
	

	}

}
