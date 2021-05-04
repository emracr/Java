import java.util.Date;

import Adapters.ValidateService;
import Business.Concrete.NeroManager;
import Business.Concrete.StarbucksManager;
import DataAccess.Concrete.NeroDao;
import DataAccess.Concrete.StarbucksDao;
import Entities.Concrete.Customer;

public class Main {

	public static void main(String[] args) {

		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Emrullah");
		customer1.setLastName("ACAR");
		customer1.setDateOfBrith(new Date(2000,04,27));
		customer1.setNationalityId("11111111111");
		
		StarbucksManager starBucksManager = new StarbucksManager(new StarbucksDao(), new ValidateService());
		starBucksManager.add(customer1);


	}

}
