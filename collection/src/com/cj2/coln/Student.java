package com.cj2.coln;

public class Student {
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
		  return "Student["+id+", "+name+", "+dept+"]\n";
		  }
	 

	public int hashCode() {
		return id;

	}

	
	  public boolean equals(Object obj) { 
		  Student st3 = (Student) obj;
		  return this.id == st3.id; 
		  }
	 

}
