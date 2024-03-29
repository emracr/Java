package DataAccess.Concrete;

import DataAccess.Abstract.EntityRepository;

public class EntityRepositoryBase<TEntity> implements EntityRepository<TEntity>{

	@Override
	public void add(TEntity entity) {
		System.out.println("Veri tabanına eklendi");
	}

	@Override
	public void update(TEntity entity) {
		System.out.println("Veri tabanında güncellendi");
	}

	@Override
	public void delete(TEntity entity) {
		System.out.println("Veri tabanından silindi");
	}

}
