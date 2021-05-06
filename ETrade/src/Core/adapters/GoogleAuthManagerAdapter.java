package Core.adapters;


import Entities.concretes.User;
import adapters.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements GoogleAuthService {

	GoogleAuthManager googleAuthManager = new GoogleAuthManager();
	
	@Override
	public void register(User user) {
		googleAuthManager.register(user);
		
	}

	@Override
	public void login(String email, String password) {
		googleAuthManager.login(email, password);
		
	}


}
