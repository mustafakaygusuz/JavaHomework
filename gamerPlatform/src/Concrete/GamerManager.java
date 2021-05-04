package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	
	GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService){
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void addGamer(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + 
					" �simli kullan�c�n�n kay�t olma i�lemi ba�ar�yla ger�ekle�mi�tir. Aram�za Ho�geldin " + 
					gamer.getFirstName().toUpperCase() +" !!!");
		}else {
			System.out.println(gamer.getFirstName() + " " +gamer.getLastName() + " �simli kullan�c�n�n kay�t olma i�lemi onaylanmam��t�r.");
		}
		
	}

	@Override
	public void removeGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " +gamer.getLastName() + " �simli kullan�c�n�n hesab� silinmi�tir.");
		
	}

	@Override
	public void updateGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " �simli kullan�c�n�n bilgileri g�ncellenmi�tir.");
		
	}

}
