package eCommerceSimulation.core.concretes;

import eCommerceSimulation.core.abstracts.ValidatorService;

public class EmailValidatorManager implements ValidatorService {

	@Override
	public void sendVerificationMail() {
		System.out.println("Do�rulama maili yolland�.");
		
	}

}
