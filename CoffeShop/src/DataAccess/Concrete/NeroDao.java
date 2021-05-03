package DataAccess.Concrete;

import Entities.Concrete.Customer;

public class NeroDao extends EntityRepositoryBase<Customer>{
	
	@Override
	public void add(Customer entity) {
		System.out.println(entity.getFirstName()+ " " + entity.getLastName()+ " Veri tabanýna eklendi Nero");
		
	}
	
}
