package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void sellGame(Game game, Gamer gamer) {
		System.out.println(game.getGameName() + " �simli oyunun sat�n alma i�lemi ger�ekle�mi�tir.\nToplam Tutar : " + 
	game.getPrice() + "\n�yi Oyunlar! " + gamer.getFirstName().toUpperCase());
		
	}

	@Override
	public void sellGame(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getGameName() + " �simli oyunun sat�n alma i�lemi ger�ekle�mi�tir.\nToplam Tutar : " + 
				game.getPriceAfterDiscount(campaign) + "\nKullan�lan Kampanya : " + campaign.getCampaignName() +
				"\nToplam �ndirim : %" + campaign.getDiscount() +
				"\n�yi Oyunlar! " + gamer.getFirstName().toUpperCase());
		
	}

}
