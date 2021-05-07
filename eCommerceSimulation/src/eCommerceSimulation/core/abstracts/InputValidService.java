package eCommerceSimulation.core.abstracts;

import eCommerceSimulation.entities.concretes.User;

public interface InputValidService {
	boolean isValid(User user);
}
