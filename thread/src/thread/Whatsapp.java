package thread;

public class Whatsapp extends Thread {
	public void run() {
		System.out.print("Whatsapp : ");
	    int notification =1;
	    
	    if(notification==0) {
	    	System.out.println("don't open whatsapp");
	    	
	    }else {
	    	System.out.println("open whatsapp and check the msgs");
	    }
		
	}


}
