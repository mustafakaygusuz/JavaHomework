package day3Homework1;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.firstName + " " + user.lastName + " isimli kullanýcý eklendi.");
	}
	
	public void remove(User user) {
		System.out.println(user.firstName + " " + user.lastName + " isimli kullanýcý silindi.");
	}
}
