package thread;

public class MyRunnable implements Runnable{//step 1
	
	public void run() {///step 2
		for(int i=1; i<=5; i++) {
			System.out.println("My Task executing "+i);
		}
	}
	
	

}
