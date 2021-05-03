package Business.Concrete;

import Business.Abstract.GameService;
import DataAccess.Abstract.IGameDao;
import Entities.Concrete.Game;

public class GameManager implements GameService{

	private IGameDao gameDao;
	
	public GameManager(IGameDao gameDao) {
		this.gameDao = gameDao;
	}

	@Override
	public void add(Game game) {
		this.gameDao.add(game);
		
	}

	@Override
	public void update(Game game) {
		this.gameDao.update(game);
		
	}

	@Override
	public void delete(Game game) {
		this.gameDao.delete(game);
		
	}

}
