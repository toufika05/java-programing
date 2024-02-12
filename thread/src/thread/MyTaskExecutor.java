package thread;
class MyTask{
	String user;
	MyTask(String user){
		this.user=user;
		
	}
	void reading() {
		for(int i=1; i<=5; i++) {
			System.out.println("Thread 1 is reading "+i);
		}
	}
	void writting() {
		for(int i=1; i<=5; i++) {
			System.out.println("Thread 2 is writting "+i);
		}
	}
	
	
}
class MyWorkers extends Thread{
	MyTask mt;
	MyWorkers(MyTask mt){
		this.mt=mt;
	}
	public void run() {
		if(mt.user.equals("reader")) {
			mt.reading();
		}else {
			mt.writting();
		}
	}   
}

public class MyTaskExecutor { 

	public static void main(String[] args) {
	MyWorkers mw=new MyWorkers(new MyTask("reader"));
	MyWorkers mw2=new MyWorkers(new MyTask("writter"));
	mw.start();
	mw2.start();

	}

}
