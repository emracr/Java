package Business.validationRules;

import java.util.List;

import Entities.concretes.User;

public interface Validatetor {

	boolean validate(User user, List<User> users);
	
}
