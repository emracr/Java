package Business.Concrete;

import Business.Abstract.NeroService;
import DataAccess.Concrete.NeroDao;
import Entities.Concrete.Customer;

public class NeroManager implements NeroService{

	private NeroDao neroDao;
	
	public NeroManager(NeroDao neroDao) {
		this.neroDao = neroDao;
	}

	@Override
	public void add(Customer customer) {
		this.neroDao.add(customer);
		
	}

	@Override
	public void update(Customer customer) {
		this.neroDao.update(customer);
		
	}

	@Override
	public void delete(Customer customer) {
		this.neroDao.delete(customer);
		
	}

}
