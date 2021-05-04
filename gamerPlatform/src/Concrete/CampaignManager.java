package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Ýsimli %" + campaign.getDiscount() + " indirimli kampanya eklenmiþtir.");
		
	}

	@Override
	public void removeCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Ýsimli kampayna kaldýrýlmýþtýr.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Ýsimli kampanya güncellenmiþtir.");
		
	}

}
