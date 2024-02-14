class MyRunnable1 implements Runnable{
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Downloading "+i+"%");
			
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class MyRunnable2 implements Runnable{
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Uploading "+i+"%");
			
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExaple {

	public static void main(String[] args) {
		MyRunnable1 m1=new MyRunnable1();
		Thread th1=new Thread(m1);
		th1.start();
		
		MyRunnable2 m2=new MyRunnable2();
		Thread th2=new Thread(m2);
		th2.start();
		

	}

}
