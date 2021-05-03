package DataAccess.Concrete;

import DataAccess.Abstract.ICampaignDao;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;

public class CampaignDao extends EntityRepositoryBase<Campaign> implements ICampaignDao{

	@Override
	public void add(Campaign campaign, Game game) {
		System.out.println(campaign.getCampaignName() + " ba�lad�. " + game.getGameName() + " oyununa indirim yap�ld�, bu f�rsat� ka��rma");
		
	}
	
	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " g�ncellendi");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " sona ermi�tir");
	}

	
}
