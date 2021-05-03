package Business.Abstract;

import Entities.Concrete.Campaign;
import Entities.Concrete.Game;

public interface CampaignService {

	void add(Game game, Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
}
