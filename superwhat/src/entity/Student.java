package entity;

public class Student {
	
	private String firstName;
	private String lastName;
	


	public Student() {
		
		System.out.println("the no arg constructor was called");
		System.out.println(firstName + " " + lastName);
	}



	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("the arg cons was called");
		System.out.println(firstName + " " + lastName);
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
