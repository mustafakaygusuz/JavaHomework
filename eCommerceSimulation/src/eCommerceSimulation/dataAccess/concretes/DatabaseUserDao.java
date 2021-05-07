package eCommerceSimulation.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceSimulation.dataAccess.abstracts.UserDao;
import eCommerceSimulation.entities.concretes.User;

public class DatabaseUserDao implements UserDao {
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName() + " adlý kullanýcý sisteme kayýt edildi");
		
	}

	@Override
	public boolean emailCheck(User user) {
		for (User u : users) {
			if (u.getEmail() == user.getEmail()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean loginByCheck(String email, String password) {
		for (User user : users) {
			if (user.getEmail() == email && user.getPassword() == password) {
				return true;
			}
		}
		return false;
	}

	

}
