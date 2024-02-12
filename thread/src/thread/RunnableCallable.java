package thread;

import java.util.concurrent.*;
public class RunnableCallable {

	public static void main(String[] args) throws InterruptedException,ExecutionException {
		
		ExecutorService service1 = Executors.newSingleThreadExecutor();
		  Future<?> future1 = service1.submit(()-> {
			 
			  System.out.println("Executing task by runnable run() method which returns nothing");
		 });
        System.out.println("result: "+future1.get());
        service1.shutdown();
        
        
        ExecutorService service2 = Executors.newSingleThreadExecutor();
         Future<?> future2 = service2.submit(()-> {
        	System.out.println("Executing task by callable call() method which returns a value");
        	return 10;
        });
	  System.out.println("result: "+future2.get());
	  service2.shutdown();
	}

}
