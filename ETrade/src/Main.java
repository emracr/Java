import Business.abstracts.AuthService;
import Business.abstracts.UserService;
import Business.concretes.AuthManager;
import Business.concretes.UserManager;
import Business.validationRules.UserValidator;
import Core.adapters.GoogleAuthManagerAdapter;
import Core.adapters.GoogleAuthService;
import DataAccess.concretes.HnUserDao;
import Entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		HnUserDao hnUserDao = new HnUserDao();

		UserService userService = new UserManager(hnUserDao, new UserValidator());

		User user1 = new User(1, "Emrullah", "ACAR", "emrullahgmail.com", "123456");
		User user2 = new User(1, "Emrullah", "ACAR", "emrullah@gmail.com", "123");
		User user3 = new User(1, "Emrullah", "ACAR", "emrullah@gmail.com", "12345678");
		User user4 = new User(1, "Emrullah", "ACAR", "emrullah@gmail.com", "12345678");
		userService.register(user1);
		userService.register(user2);
		userService.register(user3);
		userService.register(user4);

		User user5 = new User(1, "Emrullah", "ACAR", "emrullah@gmail.com", "12345678");
		userService.register(user5);

		AuthService authService = new AuthManager(hnUserDao);
		authService.login("emrullah@gmail.com", "12345678");

		User googleUser = new User(2, "Murat", "ACAR", "muratacar@gmail.com", "murat.23");
		GoogleAuthService googleAuthService = new GoogleAuthManagerAdapter();
		googleAuthService.register(googleUser);
		googleAuthService.login("muratacar@gmail.com", "murat.23");
		googleAuthService.login("muratacar@gmail.com", "murat.dfdf");

	}

}
