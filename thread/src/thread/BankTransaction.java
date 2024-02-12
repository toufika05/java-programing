package thread;
class Account{
	int balance=500;  //my account
	synchronized void transaction(int amt) {
		Thread thread=Thread.currentThread();
		String name=thread.getName();
		System.out.println(name+" Access the Account");
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			//todo auto-generated catch block
			e.printStackTrace();
		}
		if(amt<=balance) {
			System.out.println(name+" Transaction successful");
			balance-=amt;
			
		}
		System.out.println("Remaining balance: "+balance);
	}
}
class UserThread extends Thread{
	Account ac;
	int amt;
	public UserThread(Account ac,int amt) {
		this.ac=ac;
		this.amt=amt;
	}
		public void run() {
			ac.transaction(amt);	
	}
}

public class BankTransaction {
public static void main(String[] args) {
	Account ac=new Account();
	
	UserThread th1=new UserThread(ac,500);
	th1.setName("M Alam");
	
	UserThread th2=new UserThread(ac,500);
	th2.setName("T Sultana");
	
	th1.start();
	th2.start();
			
}
}
