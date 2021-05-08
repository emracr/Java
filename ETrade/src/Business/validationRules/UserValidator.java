package Business.validationRules;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Entities.concretes.User;

public class UserValidator implements Validator{

	@Override
	public boolean validate(User user, List<User> users) {
		
		boolean isVerify = false;
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.geteMail());
		
		for(User mail : users) {
			if(user.geteMail() == mail.geteMail()) {
				System.out.println("Bu email daha önce kullanýlmýþ lütfen farklý bir email deneyin");
				return false;
			}
		}
		if(user.getFirstName().length() < 2) {
			System.out.println("Ad en az iki karakterden oluþmalýdýr");
		}
		else if(user.getLastName().length() < 2) {
			System.out.println("Soyad en az iki karakterden oluþmalýdýr");
		}
		else if(!matcher.matches()) {
			System.out.println("Girdiðiniz E-posta adresi e-posta formatýnda deðildir.");
		}

		else if(user.getPassword().length() < 6) {
			System.out.println("Parola en az 6 karakterden oluþmalýdýr");
		}
		else {
			
			System.out.println("Hesabýnýzýn aktif edilebilmesi için lütfen e posta adresinizi doðrulayýn");
			System.out.print("E posta adresimi doðrula : 1-doðrula/2-doðrulama : ");
			Scanner scanner = new Scanner(System.in);
			int verify = scanner.nextInt();
			if(verify == 1) {
				isVerify = true;
				System.out.println("Hesabýnýz doðrulandý.");
			}
			else {
				isVerify = false;
				System.out.println("Malesef hesabýnýz doðrulanmadý");
			}
			
		}
		
		return isVerify;
		
	}
}
