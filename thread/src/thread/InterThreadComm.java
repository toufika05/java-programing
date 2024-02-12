package thread;
class Accounts{///extends object
	int balance;
	synchronized void withdraw(int amt) {
		Thread th=Thread.currentThread();
		String name=th.getName();
		System.out.println(name+" is going to withdraw money");
		if(amt>balance) {
			
			System.out.println(name+" balance insufficient please wait for deposit "+balance);
			try {wait();
		}catch (InterruptedException e) {
			e.printStackTrace();}
		}
		balance-=amt;
		System.out.println(name+" your withdraw successful,Remaning balance "+balance);
	}
	synchronized void deposit(int amt) {
		Thread th=Thread.currentThread();
		String name=th.getName();
		System.out.println(name+" is going to deposit");
		balance+=amt;
		System.out.println(name+" deposit successful now balance "+balance);
		notify();
	}
}
class UserThreads extends Thread{
	Accounts acc;
	String type;
	int amt;
	public UserThreads(Accounts acc,String type, int amt) {
		this.acc=acc;
		this.type=type;
		this.amt=amt;
	}
	public void run() {
		if(type.equals("withdraw")) {
			acc.withdraw(amt);
		}else {
			acc.deposit(amt);
		}
	}
}

public class InterThreadComm {

	public static void main(String[] args) {
    Accounts ac=new Accounts();
    UserThreads th1=new UserThreads(ac,"withdraw",300);
    th1.setName("M Alam");
    
    UserThreads th2=new UserThreads(ac,"deposit",500);
    th2.setName("sultana");
    th1.start();
    th2.start();
    

	}

}






