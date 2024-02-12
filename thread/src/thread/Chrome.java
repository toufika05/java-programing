package thread;

public class Chrome {

	public static void main(String[] args) {
		
	System.out.println("chromes opening tabs are: ");
	System.out.println();
		
       Youtube y=new Youtube();
       y.start();
     
       
       Whatsapp w=new Whatsapp();
       w.start();
      
       
       Instagram i=new Instagram();
       i.start();

	}

}
