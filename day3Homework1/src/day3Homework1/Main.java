package day3Homework1;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Mustafa", "Kaygusuz", "mustafa@email.com", "123", "1");
		
		Student student2 = new Student();
		student2.id = 2;
		student2.firstName = "Emircan";
		student2.lastName = "Dumlu";
		student2.email = "emircan@gmail.com";
		student2.password = "321";
		student2.studentNumber = "2";
		
		Instructor instructor1 = new Instructor(3, "Engin", "Demiroğ", "engin@email.com", "312", "1", "iyi bir eğitmen");
		
		Instructor instructor2 = new Instructor();
		instructor2.id = 4;
		instructor2.firstName = "Kerem";
		instructor2.lastName = "Varış";
		instructor2.email = "kerem@gmail.com";
		instructor2.password = "213";
		instructor2.instructorNumber = "2";
		instructor2.instructorDetail = "güzel anlatım"; 
		
		
		System.out.println(student1.firstName + " " + student2.firstName);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.remove(instructor2);
		instructorManager.createCourse("c# kursu");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.remove(instructor2);
		studentManager.selectCourse("java kursuü"); 
		

	}

}
