package DataAccess.Concrete;

import DataAccess.Abstract.EntityRepository;

public class EntityRepositoryBase<T> implements EntityRepository<T>{

	@Override
	public void add(T entity) {
		System.out.println("Veri tabanına eklendi");
		
	}

	@Override
	public void update(T entity) {
		System.out.println("Veri tabanında güncellendi");
		
	}

	@Override
	public void delete(T entity) {
		System.out.println("Veri tabanından silindi");
		
	}

}
