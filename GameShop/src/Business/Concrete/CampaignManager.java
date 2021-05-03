package Business.Concrete;

import Business.Abstract.CampaignService;
import DataAccess.Abstract.ICampaignDao;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;

public class CampaignManager implements CampaignService{

	private ICampaignDao campaignDao;
	
	public CampaignManager(ICampaignDao campaignDao) {
		this.campaignDao = campaignDao;
	}

	@Override
	public void add(Game game, Campaign campaign) {
		
		this.campaignDao.add(campaign, game);
		
	}

	@Override
	public void update(Campaign campaign) {
		this.campaignDao.update(campaign);
		
	}

	@Override
	public void delete(Campaign campaign) {
		this.campaignDao.delete(campaign);
	}

	

}
