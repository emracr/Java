package DataAccess.Concrete;

import DataAccess.Abstract.IUserDao;
import Entities.Concrete.User;

public class UserDao extends EntityRepositoryBase<User> implements IUserDao{
	
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " sisteme eklendi");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcýsý bilgilerini güncelledi");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcýsý sistemden silindi");
	}
}
