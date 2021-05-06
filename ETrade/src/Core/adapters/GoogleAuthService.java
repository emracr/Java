package Core.adapters;

import Entities.concretes.User;

public interface GoogleAuthService	{
	
	void register(User user);
	void login(String email, String password);
}
