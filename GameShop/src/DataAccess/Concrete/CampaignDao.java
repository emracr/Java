package DataAccess.Concrete;

import DataAccess.Abstract.ICampaignDao;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;

public class CampaignDao extends EntityRepositoryBase<Campaign> implements ICampaignDao{

	@Override
	public void add(Campaign campaign, Game game) {
		System.out.println(campaign.getCampaignName() + " baþladý. " + game.getGameName() + " oyununa indirim yapýldý, bu fýrsatý kaçýrma");
		
	}
	
	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " güncellendi");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " sona ermiþtir");
	}

	
}
