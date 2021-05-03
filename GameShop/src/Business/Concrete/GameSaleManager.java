package Business.Concrete;

import Business.Abstract.GameSaleService;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.User;

public class GameSaleManager implements GameSaleService{
	
	@Override
	public void buyWithoutCampaign(User user, Game game) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcýsý " + game.getGameName() + " oyununu satýn aldý");
		
	}

	@Override
	public void buyWithCampaign(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcýsý " + campaign.getCampaignName() + " ile " + game.getGameName() + " oyununu indirimli satýn aldý");
		
	}
	
	@Override
	public void returnOfGame(User user, Game game) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcýsý " + game.getGameName() + " oyununu iade etti");
		
	}

}
