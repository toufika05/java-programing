package com.cj2.coln;
import java.util.*;

class Attachment{
	int document=1;
	
	synchronized void sendingMail(int received) {
		Thread th=Thread.currentThread();
		String name=th.getName();
		System.out.println(name+" is going to send a mail to Client.");
		System.out.println();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Checking  the document is received  or not: ");
		received=sc.nextInt();
		System.out.println();
		if(received!=document) {
			
			System.out.println("document is not received."); 
			System.out.println("priya does not send the documents yet.");
			System.out.println(name+"  told Priya to send the document. ");
			System.out.println();
			try {wait();
		}catch (InterruptedException e) {
			e.printStackTrace();} 
		
		}
		System.out.println("document is received.");
		System.out.println(name+" Attach the document and then send  mail to the client. ");
		}
	
	synchronized void receivingMail(int received) {
		Thread th=Thread.currentThread();
		String name=th.getName();
		if(received!=document) {
		System.out.println(name+" sending the document  to Ram. ");
		System.out.println();
		}
		notify();
	}
}
class User extends Thread{
	Attachment att;
	String type;
	 int received;
	public User(Attachment att,String type, int received) {
		this.att=att;
		this.type=type;
		this.received=received;
	}
	public void run() {
		if(type.equals("receiving")) {
			att.sendingMail(received);
		}else {
			att.receivingMail(received);
		}
	}
}


public class AttachDocument {

	public static void main(String[] args) {
		  Attachment aa=new Attachment();
		    User u1=new User(aa,"receiving",0);
		    u1.setName("Ram");
		    
		    User u2=new User(aa,"sending",0);
		    u2.setName("Priya");
		    u1.start();
		    u2.start();
	}
}   