package entity;
import entity.Student;

public class superstudent extends Student {
	
	private String grade;

	public superstudent(String grade) {
		super("Tony", "Terrific");
		this.grade = grade;
		
		tellus();
	}
	
	private void tellus() {
		
		System.out.println("The Student name is " + super.getFirstName() + " " + super.getLastName());
		System.out.println(super.getFirstName()+"'s grade was "+ grade);
	}

}
