package gamerPlatform;

import java.util.GregorianCalendar;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Mustafa Ýlhan");
		gamer.setLastName("Kaygusuz");
		gamer.setNationalityId("52423156468");
		gamer.setDateOfBirth(new GregorianCalendar(2002, 06 , 13).getTime());	
		
		Campaign campaign = new Campaign(1, "Efsane Cuma", 20.5, true);
		
		Game game = new Game();
		game.setId(1);
		game.setGameName("Call of Duty : Modern Warfare");
		game.setPrice(472.5);
		game.setDescription("Call of Duty serisinin en güncel oyunu...");		
		
		
		GamerManager gamermanager = new GamerManager(new MernisServiceAdapter());
		gamermanager.addGamer(gamer);
		gamermanager.removeGamer(gamer);
		gamermanager.updateGamer(gamer);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign);
		campaignManager.removeCampaign(campaign);
		campaignManager.updateCampaign(campaign);
		
		GameManager gameManager = new GameManager();
		gameManager.sellGame(game, gamer);
		gameManager.sellGame(game, gamer, campaign);
	}

}
