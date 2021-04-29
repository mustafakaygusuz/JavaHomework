package day3Homework1;

public class InstructorManager extends UserManager {

	@Override
	public void add(User user) {
		
		super.add(user);
	}

	@Override
	public void remove(User user) {
		
		super.remove(user);
	}
	
	public void createCourse(String courseName) {
		System.out.println(courseName + " ismindeki kurs eklendi.");
	}
	
	
}
