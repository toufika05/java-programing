package thread;
import java.util.concurrent.*;

public class ExecutorThread {

	public static void main(String[] args) {
		//ExecutorService service = Executors.newSingleThreadExecutor();
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		
		for(int i=0; i<5; i++) {
		service.execute(()-> {
			System.out.println(Thread.currentThread().getName()+" start executing task...");
			
		});

		}
		   service.shutdown();
	}

}

