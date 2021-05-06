package Business.abstracts;

import java.util.List;

import Entities.concretes.User;

public interface UserService {
	
	List<User> getAll();

	void register(User user);

	void update(User user);
}
