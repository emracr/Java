package Business.Concrete;

import Business.Abstract.MernisService;
import Business.Abstract.UserService;
import DataAccess.Abstract.IUserDao;
import Entities.Concrete.User;

public class UserManager implements UserService{

	private IUserDao userDao;
	private MernisService mernisService;
	
	public UserManager(IUserDao userDao, MernisService mernisService) {
		this.userDao = userDao;
		this.mernisService = mernisService;
	}

	@Override
	public void add(User user) {
		
		if(mernisService.validate(user)) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " adlý kiþi mernis doðrulamasýndan geçti");
			this.userDao.add(user);
		}
		else {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " adlý kiþi mernis doðrulamasýndan geçemedi");
		}
		
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

}
