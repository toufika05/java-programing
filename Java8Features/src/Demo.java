
public class Demo {
   public static void main(String[] args) {
	   Dinga d= (int i)->{  ///lambda expression
		   
			   System.out.print( i+ " Factorial value ");
			   int fact=1;
			   for(int j=1; j<=i; j++) {
				   fact*=j;
			   }
			   System.out.println(fact);
	   };
	   d.factValue(5);
   }
}
