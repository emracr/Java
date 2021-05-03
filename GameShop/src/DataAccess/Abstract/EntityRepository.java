package DataAccess.Abstract;

public interface EntityRepository<T> {
	
	void add(T entity);
	void update(T entity);
	void delete(T entity);
	
}
