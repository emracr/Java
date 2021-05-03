package Adapters;

import Entities.Concrete.Customer;

public class ValidateService implements Validate{

	@Override
	public boolean validate(Customer customer) {
		if (customer.getFirstName().length() > 3 && customer.getLastName().length() > 3 && customer.getNationalityId().length() == 11 && customer.getDateOfBriht() > 1980) {
			return true;
		}
		return false;
	}

	
}
