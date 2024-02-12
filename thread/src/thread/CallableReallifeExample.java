package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableReallifeExample {

	public static void main(String[] args) throws InterruptedException,ExecutionException {
		
   ExecutorService service = Executors.newSingleThreadExecutor();
   
   Future<Integer> future = service.submit(()->{
	   
	   System.out.println("OTP generated and send to your phone number");
	   Thread.sleep(5000);
	   return 1234;
   });

 while(!future.isDone()) {
	 System.out.println("Waiting for OTP");
	 Thread.sleep(1000);
 }
 
 System.out.println("result: "+future.get());
 service.shutdown();
   
	}

}
