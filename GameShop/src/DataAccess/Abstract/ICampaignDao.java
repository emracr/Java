package DataAccess.Abstract;

import Entities.Concrete.Campaign;
import Entities.Concrete.Game;

public interface ICampaignDao extends EntityRepository<Campaign>{

	void add(Campaign campaign, Game game);
	
}
