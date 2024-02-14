import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private double marks;
	private String gender;
	
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
	public double getMarks() {
		return marks;
	}
	public void setDept(double marks) {
		this.marks = marks;
	}
	public String getGender() {
		return  gender;
	}
	public void setGender(String gender) {
		this.gender= gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", gender=" + gender + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, double marks, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.gender = gender;
	}
	
	
	}
	
	


