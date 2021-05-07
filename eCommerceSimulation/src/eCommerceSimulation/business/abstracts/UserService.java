package eCommerceSimulation.business.abstracts;

import eCommerceSimulation.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(String email, String password);
}
