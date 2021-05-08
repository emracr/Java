package Business.validationRules;

import java.util.List;

import Entities.concretes.User;

public interface Validator {

	boolean validate(User user, List<User> users);
	
}
