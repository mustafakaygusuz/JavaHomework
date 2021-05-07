package eCommerceSimulation.core.concretes;

import eCommerceSimulation.core.abstracts.InputValidService;
import eCommerceSimulation.entities.concretes.User;
import eCommerceSimulation.jGoogleValid.JGoogleValidService;

public class JGoogleValidServiceAdapter implements InputValidService {

	@Override
	public boolean isValid(User user) {
		JGoogleValidService googleUserValid = new JGoogleValidService();
		return googleUserValid.isValid();
	}

}
