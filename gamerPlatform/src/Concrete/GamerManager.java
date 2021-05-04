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
					" Ýsimli kullanýcýnýn kayýt olma iþlemi baþarýyla gerçekleþmiþtir. Aramýza Hoþgeldin " + 
					gamer.getFirstName().toUpperCase() +" !!!");
		}else {
			System.out.println(gamer.getFirstName() + " " +gamer.getLastName() + " Ýsimli kullanýcýnýn kayýt olma iþlemi onaylanmamýþtýr.");
		}
		
	}

	@Override
	public void removeGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " +gamer.getLastName() + " Ýsimli kullanýcýnýn hesabý silinmiþtir.");
		
	}

	@Override
	public void updateGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " Ýsimli kullanýcýnýn bilgileri güncellenmiþtir.");
		
	}

}
