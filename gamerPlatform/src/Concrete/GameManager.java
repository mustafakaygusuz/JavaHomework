package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void sellGame(Game game, Gamer gamer) {
		System.out.println(game.getGameName() + " Ýsimli oyunun satýn alma iþlemi gerçekleþmiþtir.\nToplam Tutar : " + 
	game.getPrice() + "\nÝyi Oyunlar! " + gamer.getFirstName().toUpperCase());
		
	}

	@Override
	public void sellGame(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getGameName() + " Ýsimli oyunun satýn alma iþlemi gerçekleþmiþtir.\nToplam Tutar : " + 
				game.getPriceAfterDiscount(campaign) + "\nKullanýlan Kampanya : " + campaign.getCampaignName() +
				"\nToplam Ýndirim : %" + campaign.getDiscount() +
				"\nÝyi Oyunlar! " + gamer.getFirstName().toUpperCase());
		
	}

}
