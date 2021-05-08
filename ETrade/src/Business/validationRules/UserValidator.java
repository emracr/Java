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
				System.out.println("Bu email daha �nce kullan�lm�� l�tfen farkl� bir email deneyin");
				return false;
			}
		}
		if(user.getFirstName().length() < 2) {
			System.out.println("Ad en az iki karakterden olu�mal�d�r");
		}
		else if(user.getLastName().length() < 2) {
			System.out.println("Soyad en az iki karakterden olu�mal�d�r");
		}
		else if(!matcher.matches()) {
			System.out.println("Girdi�iniz E-posta adresi e-posta format�nda de�ildir.");
		}

		else if(user.getPassword().length() < 6) {
			System.out.println("Parola en az 6 karakterden olu�mal�d�r");
		}
		else {
			
			System.out.println("Hesab�n�z�n aktif edilebilmesi i�in l�tfen e posta adresinizi do�rulay�n");
			System.out.print("E posta adresimi do�rula : 1-do�rula/2-do�rulama : ");
			Scanner scanner = new Scanner(System.in);
			int verify = scanner.nextInt();
			if(verify == 1) {
				isVerify = true;
				System.out.println("Hesab�n�z do�ruland�.");
			}
			else {
				isVerify = false;
				System.out.println("Malesef hesab�n�z do�rulanmad�");
			}
			
		}
		
		return isVerify;
		
	}
}
