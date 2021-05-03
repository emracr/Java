package DataAccess.Concrete;

import DataAccess.Abstract.IGameDao;
import Entities.Concrete.Game;

public class GameDao extends EntityRepositoryBase<Game> implements IGameDao{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " sisteme eklendi");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " oyununun bilgileri güncelledi");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+ " oyunu sistemden silindi");
	}
	
}
