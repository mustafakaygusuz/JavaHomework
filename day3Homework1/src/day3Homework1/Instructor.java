package day3Homework1;

public class Instructor extends User {
	String instructorNumber;
	String instructorDetail;
	
	public Instructor(int id, String firstName, String lastName, String email, String password,
			String instructorNumber, String instructorDetail) {
		super(id, firstName, lastName, email, password);
		this.instructorNumber = instructorNumber;
		this.instructorDetail = instructorDetail;
	}
	
	public Instructor() {
		
	}

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

	public String getInstructorDetail() {
		return instructorDetail;
	}

	public void setInstructorDetail(String instructorDetail) {
		this.instructorDetail = instructorDetail;
	}

}
