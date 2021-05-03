package Business.Concrete;

import Business.Abstract.MernisService;
import Entities.Concrete.User;

public class MernisManager implements MernisService{

	@Override
	public boolean validate(User user) {
		
		if(user.getNationalityId().length() == 11 && user.getFirstName().length() > 2 && user.getLastName().length() > 2 && user.getDateOfYear() > 1980) {
			return true;
		}
		return false;
		
	}

}
