package Business.concretes;

import java.util.List;

import Business.abstracts.UserService;
import Business.validationRules.Validator;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private Validator validator;
	
	public UserManager(UserDao userDao, Validator validator) {
		this.userDao = userDao;
		this.validator = validator;
	}

	@Override
	public List<User> getAll() {
		
		return this.userDao.getAll();
	}
	
	@Override
	public void register(User user) {
		
		if(validator.validate(user,this.userDao.getAll())) {
			this.userDao.add(user);
			System.out.println(user.getFirstName() + " " + user.getLastName() + " sisteme üye oldu");
		}
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " bilgilerini güncelledi");
		
	}

}
