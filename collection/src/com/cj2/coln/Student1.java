package com.cj2.coln;
public class Student1 implements Comparable{
	private int id;
	private String name;
	private String dept;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return "Student1["+id+", "+name+", "+dept+"]\n";
	}
	
	
	  public int hashCode() { 
		  return id;
		  } 
	  public boolean equals(Object obj) {
	   Student1 st3=(Student1)obj; 
	   return this.id==st3.id; 
	   }
	 
	@Override
	  public int compareTo(Object o) {
	   Student1 st=(Student1) o; 
	   return this.id-st.id;
	}
	 

	
}
