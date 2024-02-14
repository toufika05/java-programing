import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
	  
		List<Student> list=Arrays.asList(
				new Student(101,"Toufika",67.84,"Female"),
				new Student(102,"Jhony",74.84,"Male"),
				new Student(103,"Manjot",79.84,"Male"),
				new Student(104,"Priya",97.84,"Female"),
				new Student(105,"Azam",60.84,"Male")
				
				);
          ///without stream
       ////find out the highest mark student details from list of students?
		
			/*
			 * Student st=list.get(0); 
			 * for(Student student : list) {
			 *      if(student.getMarks() >st.getMarks()) {
			 *            st=student;
			 *    
			 *                   }
			 *           } 
			 *        System.out.println(st);
			 */
		
		
		///with stream
		/*Stream<Student> stream = list.stream();
		Optional<Student> max = stream.max((st1,st2)->(int)(st1.getMarks()-st2.getMarks()));
		System.out.println(max);
	*/
      list.stream()////convert collection into stream
      .max(Comparator.comparing(Student::getMarks))///find the maximum marks student details as optional
      .ifPresent(System.out::println); //if present print it
      
      ////find out the lowest mark student details from the list of the students?
      
      list.stream()////convert collection into stream
      .min(Comparator.comparing(Student::getMarks))///find the maximum marks student details as optional
      .ifPresent(System.out::println); //if present print it
		
		/////check all the students are above 60% or not??
      ////without stream
      
		
		/*
		 * boolean flag=true;
		 *  for(Student student :list) {
		 *   if(student.getMarks()<60.00){
		 *     flag=false;
		 *     
		 *      } 
		 *   }
		 *    System.out.println("All the students are above 60% "+flag);
		 */
		 ////with stream
      boolean allMatch=list.stream().allMatch((st)->st.getMarks()>=60.00);
      System.out.println("all the students are above 60%: "+allMatch);
      
      
      //is there any student is above 60% or not??
      boolean anyMatch=list.stream().anyMatch((st)->st.getMarks()>=60.00);
      System.out.println("is there any student above 60%: "+anyMatch);
      
      
      ///====without stream segregate students gender wise=======////
         List<Student> malest=new ArrayList();
         List<Student> femalest=new ArrayList();
         for(Student student:list) {
        	 if(student.getGender().equals("Male")){
        		 malest.add(student);
        	 }
        	 else {
        		 femalest.add(student);
        	 }
         }
        	System.out.println("=======male candidates are=======");
        	for(Student student: malest) {
        		System.out.println(student);
        		
        	}
        	
        	System.out.println("=====female candidates only======");
        	for(Student student : femalest ) {
        		System.out.println(student);
        	}
        	
       ///with stream
        	Map<String, List<Student>> collect=list.stream()
        	   .collect(Collectors.groupingBy(Student::getGender));
        	collect.forEach((gender,stList)->{
        		System.out.println("====="+gender+" =========");
       
				stList.forEach(System.out::println);
        	});
	
	
	}	
        	 
	}
      
	

