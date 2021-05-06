package DataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import DataAccess.abstracts.EntityRepository;

public class HnEntityRepositoryBase<T> implements EntityRepository<T>{

	private List<T> list = new ArrayList<>();
	
	@Override
	public void add(T entity) {
		list.add(entity);
		
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> getAll() {
		
		return list;
	}

}
