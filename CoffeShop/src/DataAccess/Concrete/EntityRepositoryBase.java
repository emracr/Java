package DataAccess.Concrete;

import DataAccess.Abstract.EntityRepository;

public class EntityRepositoryBase<T> implements EntityRepository<T>{

	@Override
	public void add(T entity) {
		System.out.println("Veri taban�na eklendi");
		
	}

	@Override
	public void update(T entity) {
		System.out.println("Veri taban�nda g�ncellendi");
		
	}

	@Override
	public void delete(T entity) {
		System.out.println("Veri taban�ndan silindi");
		
	}

}
