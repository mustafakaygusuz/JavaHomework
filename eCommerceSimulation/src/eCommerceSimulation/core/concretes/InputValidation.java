package eCommerceSimulation.core.concretes;

import eCommerceSimulation.core.abstracts.InputValidService;
import eCommerceSimulation.entities.concretes.User;
import java.util.regex.Pattern;

public class InputValidation implements InputValidService {
	
	public boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9+&*-]+(?:\\." +
                "[a-zA-Z0-9+&-]+)@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }


    public boolean isValidPassword(String password) {
        if (password == null || password.length() < 6) {
            return false;
        }

        return true;
    }


    public boolean isValidString(String name) {

        if (name == null || name.length() < 2) {
            return false;
        }
        for (char c : name.toCharArray()) {
            if (Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }


    @Override
    public boolean isValid(User user) {
        if(!isValidEmail(user.getEmail())){
            System.out.println("Hatalý Email! Lütfen tekrar deneyin.");
            return false;

        }

        if(!isValidString(user.getFirstName())){
            System.out.println("Geçersiz isim : en az 2 karakter girmelisiniz ve sayý içermemeli!");
            return false;

        }
        if(!isValidString(user.getLastName())){
            System.out.println("Geçersiz Soyad : en az 2 karakter girmelisiniz ve sayý içermemeli!");
            return false;

        }
        if(!isValidPassword(user.getPassword())){
            System.out.println("Geçersiz Parola : en az 6 karakter girmelisiniz!");
            return false;

        }return true;

    }
}
