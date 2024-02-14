class MyTask{
	static void upload(){
		for(int i=0; i<=10; i++) {
			System.out.println("Uploading "+ i+ "%");
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	static void download(){
		for(int i=0; i<=10; i++) {
			System.out.println("Downloading "+ i+ "%");
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class MethodReference1 {

	public static void main(String[] args) {
     
		Runnable mr1=MyTask::upload;
		Thread th1=new Thread(mr1);
	     th1.start();
	     
	     Runnable mr2=MyTask::download;
	     Thread th2=new Thread(mr2);
	     th2.start();
	     
		
		
		
		
		

	}

}
