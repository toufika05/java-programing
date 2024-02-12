package thread;
class MyTasks{
	String user;
	MyTasks(String user){
		this.user=user;
		
	}
	void reading() {
		Thread thread=Thread.currentThread();
		String name=thread.getName();
		for(int i=1; i<=5; i++) {
			System.out.println(name+" is reading "+i);
		}
	}
	void writting() {
		Thread thread=Thread.currentThread();
		String name=thread.getName();
		for(int i=1; i<=5; i++) {
			System.out.println(name+" is writting "+i);
		}
	}
	
	
}
class MyWorker extends Thread{
	MyTasks mt;
	MyWorker(MyTasks mt){
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

public class MyTaskExe {

	public static void main(String[] args) {
		MyWorker mw=new MyWorker(new MyTasks("reader"));
		mw.setName("Reader Thread");
		MyWorker mw2=new MyWorker(new MyTasks("writter"));
		mw2.setName("Writer Thread");
		mw.start();
		mw2.start();


	}

}
