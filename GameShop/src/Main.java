import java.util.Date;

import Business.Concrete.CampaignManager;
import Business.Concrete.GameManager;
import Business.Concrete.GameSaleManager;
import Business.Concrete.MernisManager;
import Business.Concrete.UserManager;
import DataAccess.Concrete.CampaignDao;
import DataAccess.Concrete.GameDao;
import DataAccess.Concrete.UserDao;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Emrullah");
		user1.setLastName("ACAR");
		user1.setDateOfBrith(new Date(2000,04,27));
		user1.setNationalityId("22222222222");
		
		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Murat");
		user2.setLastName("ACAR");
		user2.setDateOfBrith(new Date(1995,04,27));
		user2.setNationalityId("11111111111");
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("GTA 5");
		game1.setPrice(200);
		
		Game game2 = new Game();
		game2.setId(2);
		game2.setGameName("CS GO");
		game2.setPrice(70);
		
		UserManager userManager = new UserManager(new UserDao(), new MernisManager());
		userManager.add(user1);
		userManager.update(user1);
		userManager.delete(user1);
		userManager.add(user2);
		GameManager gameManager = new GameManager(new GameDao());
		gameManager.add(game1);
		gameManager.add(game2);
		
		GameSaleManager saleManager = new GameSaleManager();
		saleManager.buyWithoutCampaign(user1, game1);
		saleManager.returnOfGame(user1, game1);
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setCampaignName("Bahar Kampanyasý");
		campaign1.setGame("GTA 5");
		campaign1.setPrice(100);
		
		CampaignManager campaignManager = new CampaignManager(new CampaignDao());
		campaignManager.add(game1, campaign1);
		campaignManager.update(campaign1);
		campaignManager.delete(campaign1);
		
		saleManager.buyWithCampaign(user1, game1, campaign1);
	}

}
