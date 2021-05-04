package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface GameService {
	void sellGame(Game game , Gamer gamer);
	
	void sellGame(Game game, Gamer gamer, Campaign campaign);
}
