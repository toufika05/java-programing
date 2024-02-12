package thread;
class MyTask1{
	synchronized void task() {
		Thread thread =Thread.currentThread();
		String name=thread.getName();
		for(int i=1; i<=5; i++) {
			System.out.println(name+" Thread is Running..  "+i); 

		try {
			Thread.sleep(1000);
    		}catch( InterruptedException e) {
    			e.printStackTrace();
    		}
		}
	}
}
class MyUserThreads extends Thread{
	MyTask1 mt;
	public MyUserThreads(MyTask1 mt) {
		this.mt=mt;
	}
	public void run() {
		mt.task();
	}
}

public class ThreadMethod {

	public static void main(String[] args) {
		MyTask1 mt=new MyTask1();
		MyUserThreads th1=new MyUserThreads(mt);
		th1.setName("th1");
		MyUserThreads th2=new MyUserThreads(mt);
		th2.setName("th2");
		th1.start();
		th2.start();
	

	}

}
