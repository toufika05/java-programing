package thread;

public class Youtube extends Thread{
	public void run() {
	   System.out.print("Youtube : ");
	   System.out.println("playing songs on youtube");
	   
	   for(int i=1; i<=5; i++) {
		   System.out.println("playing kesariya song "+ i+" times");
	   }
	
	}

}
