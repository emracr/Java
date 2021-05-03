package Business.Abstract;

import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.User;

public interface GameSaleService {

	void buyWithoutCampaign(User user, Game game);
	void buyWithCampaign(User user, Game game, Campaign campaign);
	void returnOfGame(User user, Game game);
	
}