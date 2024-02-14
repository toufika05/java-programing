import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
	List<String> list=Arrays.asList("Azam","Toufika","Jhony");
	
	/*
	 * for(String string : list) { 
	 * System.out.println(string); 
	 * }
	 */
	
	/*
	 * Iterator<String> it=list.iterator(); 
	 * while(it.hasNext()) {0
	 *  String string=(String) it.next(); 
	 *  System.out.println(string);
	 *   }
	 */
	
	/*
	 * Object[] arr=list.toArray(); 
	 * for(int i=0; i<arr.length;i++) {
	 * System.out.println(arr[i]);
	 *  }
	 */
	
	/*
	 * Consumer<String> action=(el)-> System.out.println(el); 
	 * list.forEach(action);
	 */
     
     list.forEach((ts)->System.out.println(ts));
     
    // list.forEach(System.out::println);
			
 	}

}
