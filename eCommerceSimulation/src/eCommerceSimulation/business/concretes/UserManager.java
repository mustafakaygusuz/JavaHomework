package eCommerceSimulation.business.concretes;

import eCommerceSimulation.business.abstracts.UserService;
import eCommerceSimulation.core.abstracts.InputValidService;
import eCommerceSimulation.core.abstracts.ValidatorService;
import eCommerceSimulation.dataAccess.abstracts.UserDao;
import eCommerceSimulation.entities.concretes.User;

public class UserManager implements UserService {	

	InputValidService userInformationValidation;
	UserDao userDao;
	ValidatorService validatorService;
	
	public UserManager(InputValidService userInformationValidation, UserDao userDao,
			ValidatorService validatorService) {
		super();
		this.userInformationValidation = userInformationValidation;
		this.userDao = userDao;
		this.validatorService = validatorService;
	}

	@Override
	public void register(User user) {
		if (!userInformationValidation.isValid(user)) {
			System.out.println("Kullan�c� bilgileri ge�ersiz. Kay�t Ba�ar�s�z!");
		}else if (!userDao.emailCheck(user)) {
			System.out.println("Bu email adresi zaten kullan�l�yor : " + user.getEmail() + "\n Kay�t i�lemi Ba�ar�s�z...");
		}else {
			userDao.add(user);
			validatorService.sendVerificationMail();
		}
		
	}

	@Override
	public void login(String email, String password) {
		if (userDao.loginByCheck(email, password)) {
			System.out.println("Giri� Ba�ar�l�");
		}else {
			System.out.println("Kullan�c� ad� yanl�� veya b�yle bir kullan�c� yok!");
		}
	}

}
