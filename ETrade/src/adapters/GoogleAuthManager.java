package adapters;

import java.util.ArrayList;
import java.util.List;

import Entities.concretes.User;

public class GoogleAuthManager {

	private List<User> list = new ArrayList<>();

	public void register(User user) {
		list.add(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " google hesab� ile sisteme �ye oldu");
	}

	public void login(String email, String password) {

		for (User user : list) {
			if(email == user.geteMail() && password == user.getPassword()) {
				System.out.println(user.getFirstName() + " " + user.getLastName() + " google hesab� ile sistme giri� yapt�");
				break;
			}
			else {
				System.out.println(user.getFirstName() + " " + user.getLastName() + " google hesab� ile oturum a�ma i�lemi ba�ar�s�z tekrar deneyin ");
			}
		}

	}
	
}
