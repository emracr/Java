package Business.Abstract;

import Entities.Concrete.Customer;

public interface NeroService {

	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	
}
