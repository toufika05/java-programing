///single try multi catch
public class FinallyBlockDemo {  
	public static void main(String[] args) {
	System.out.println("program starts...");
	
	int i,j,k=0;
	try {
	i=10;
    j=2;
	k=i/j;////ArithmeticException
	System.out.println("result k: "+k);//2
	
	int[] arr=new int[k];
	arr[4]=100;///ArrayIndexOutofBoundException
	System.out.println("4th index value: "+arr[4]);
	
	String s=null;
	s.concat(" Amir");//NullpointerException
	
	}catch(ArithmeticException e) {//specific
	 //System.out.println("devided by 0 is not possible ");
		e.printStackTrace();
	}
	catch (ArrayIndexOutOfBoundsException e) {
		//System.out.println("sorry index is not available");
		e.printStackTrace();
	}

	catch(Exception e) {///general
		System.out.println("General catch block to handle any type of exception");
		//e.printStackTrace();
		
	}
	System.out.println("program ends..."); 

	}

}
