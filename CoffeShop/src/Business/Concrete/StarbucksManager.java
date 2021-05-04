package Business.Concrete;

import Adapters.Validate;
import Adapters.ValidateService;
import Business.Abstract.StarbucksService;
import DataAccess.Concrete.StarbucksDao;
import Entities.Concrete.Customer;

public class StarbucksManager implements StarbucksService{

	private StarbucksDao starbucksDao;
	private Validate validateService;
	
	public StarbucksManager(StarbucksDao starbucksDao, Validate validateService) {
		
		this.starbucksDao = starbucksDao;
		this.validateService = validateService;
	}

	@Override
	public void add(Customer customer) {
		
		if(validateService.checkCustomer(customer)) {
			System.out.println(customer.getFirstName() + " " + customer.getLastName() + " adlý kiþi mernis doðrulamasýndan geçti");
			this.starbucksDao.add(customer);
		}
		else {
			System.out.println(customer.getFirstName() + " " + customer.getLastName() + " adlý kiþi mernis doðrulamasýndan geçemedi");
		}
		
	}

	@Override
	public void update(Customer customer) {
		this.starbucksDao.update(customer);
		
	}

	@Override
	public void delete(Customer customer) {
		this.starbucksDao.delete(customer);
		
	}
	
}
