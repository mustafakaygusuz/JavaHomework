package eCommerceSimulation;

import eCommerceSimulation.business.abstracts.UserService;
import eCommerceSimulation.business.concretes.UserManager;
import eCommerceSimulation.core.concretes.EmailValidatorManager;
import eCommerceSimulation.core.concretes.InputValidation;
import eCommerceSimulation.core.concretes.JGoogleValidServiceAdapter;
import eCommerceSimulation.dataAccess.concretes.DatabaseUserDao;
import eCommerceSimulation.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setFirstName("Mustafa");
		user1.setLastName("Kaygusuz");
		user1.setEmail("mustafa@gmail.com");
		user1.setPassword("123321");
		
		User user2 = new User("Emircan", "Dumlu", "emircan@gmail.com", "321123");
		
		User user3 = new User("Ýshak", "Doðanay", "ishak@hotmail.com", "9876542");
		
		UserService userService = new UserManager(new JGoogleValidServiceAdapter(), new DatabaseUserDao(), new EmailValidatorManager());
		userService.register(user1);
		
		userService.register(user2);
		
		userService.register(user3);
		
		
		UserService userService2 = new UserManager(new JGoogleValidServiceAdapter(), new DatabaseUserDao(), new EmailValidatorManager());
		
		userService2.register(user2);
		
		userService2.login("emircan@gmail.com", "321123");
		
		userService2.login("emircan@gmail.com", "45656456");

	}

}
