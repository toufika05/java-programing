package thread;

public class Transaction extends Thread {
	public void run() {
	System.out.println("Transaction is being processed");
	System.out.println("Tracsaction waiting");
	System.out.println("Transaction is almost complete");
	System.out.println("Transaction done");
	}

}
