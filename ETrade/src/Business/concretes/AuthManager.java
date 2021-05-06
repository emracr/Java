package Business.concretes;

import Business.abstracts.AuthService;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class AuthManager implements AuthService {

	private UserDao userDao;

	public AuthManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void login(String email, String password) {

		for (User user : this.userDao.getAll()) {
			if (email == user.geteMail() && password == user.getPassword()) {
				System.out.println("Oturum açma baþarýlý sisteme hoþgeldiniz.");
				break;
			}
			else {
				System.out.println("E posta veya parola hatalý tekrar deneyin");
			}
		}

	}
}
