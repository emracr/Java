package DataAccess.Concrete;

import Entities.Concrete.Customer;

public class StarbucksDao extends EntityRepositoryBase<Customer>{

	@Override
	public void add(Customer entity) {
		System.out.println(entity.getFirstName()+ " " + entity.getLastName()+ " Veri taban�na eklendi Starbucks");
		
	}
	
}