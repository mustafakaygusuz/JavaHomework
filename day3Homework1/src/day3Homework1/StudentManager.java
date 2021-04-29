package day3Homework1;

public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		
		super.add(user);
	}

	@Override
	public void remove(User user) {
		
		super.remove(user);
	}
	
	public void selectCourse(String courseName) {
		System.out.println(courseName + " ismindeki kurs seçildi");
	}
	
	
	
}
