package thread;

//create thread by using ExecutorService
import java.util.concurrent.*;

class PrintJob implements Runnable {
	String name;
	
	PrintJob(String name) {
		this.name = name;
	}
	public void run() {
	  System.out.println(name +" Job started by Thread "+Thread.currentThread().getName());
	  try {
		Thread.sleep(5000);
	  }catch (InterruptedException e) {
		  e.printStackTrace();
	  }
	System.out.println( name + "Job completed by Thread: " +Thread.currentThread().getName());
	}
}


public class MyThreadPoolExamle {

	public static void main(String[] args) {
		
		PrintJob[] jobs = {new PrintJob("Piya"), new PrintJob("Amir"),
                new PrintJob("Samir"), new PrintJob("Sunil"),
                new PrintJob("Mita"), new PrintJob("Tina")};
				
		ExecutorService service = Executors.newFixedThreadPool(3);
              
                   for (PrintJob job: jobs) {
                           service.submit(job);
                           }
                   
                     service.shutdown();

	}

}
