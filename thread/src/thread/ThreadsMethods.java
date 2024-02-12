package thread;

class MyUserThread extends Thread{
	public void run() {
	Thread thread=Thread.currentThread();
	String name=thread.getName();
	for(int i=1; i<=5; i++) {
		System.out.println(name+" Thread is Running... "+i);
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	  }
	}
}

public class ThreadsMethods {

	public static void main(String[] args) {      
		MyUserThread th1=new MyUserThread();
		th1.setName("th1");
		MyUserThread th2=new MyUserThread();
		th2.setName("th2");
		th1.start();
		th2.start();
		
		

	}

}
