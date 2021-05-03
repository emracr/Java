package Business.Abstract;

import Entities.Concrete.Customer;

public interface StarbucksService {

	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
}
