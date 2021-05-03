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
		customer1.setDateOfBriht(2000);
		customer1.setNationalityId("11111111111");

		NeroManager neroManager = new NeroManager(new NeroDao());
		neroManager.add(customer1);

		ValidateService validateService = new ValidateService();

		StarbucksManager starBucksManager = new StarbucksManager(new StarbucksDao(), validateService);
		starBucksManager.add(customer1);

	}

}
