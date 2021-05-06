package Business.validationRules;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Entities.concretes.User;

public class UserValidator implements Validatetor{

	@Override
	public boolean validate(User user, List<User> users) {
		
		boolean isVerify = false;
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.geteMail());
		
		for(User mail : users) {
			if(user.geteMail() == mail.geteMail()) {
				System.out.println("Bu email daha önce kullanılmış lütfen farklı bir email deneyin");
				return false;
			}
		}
		if(user.getFirstName().length() < 2) {
			System.out.println("Ad en az iki karakterden oluşmalıdır");
		}
		else if(user.getLastName().length() < 2) {
			System.out.println("Soyad en az iki karakterden oluşmalıdır");
		}
		else if(!matcher.matches()) {
			System.out.println("Girdiğiniz E-posta adresi e-posta formatında değildir.");
		}

		else if(user.getPassword().length() < 6) {
			System.out.println("Parola en az 6 karakterden oluşmalıdır");
		}
		else {
			
			System.out.println("Hesabınızın aktif edilebilmesi için lütfen e posta adresinizi doğrulayın");
			System.out.print("E posta adresimi doğrula : 1-doğrula/2-doğrulama : ");
			Scanner scanner = new Scanner(System.in);
			int verify = scanner.nextInt();
			if(verify == 1) {
				isVerify = true;
				System.out.println("Hesabınız doğrulandı.");
			}
			else {
				isVerify = false;
				System.out.println("Malesef hesabınız onaylanmadı");
			}
			
		}
		
		return isVerify;

		
	}
}
