package Entities;

public class Campaign {
	private int id;
	private String campaignName;
	private double discount;
	private boolean isActive;
	
	public Campaign(int id, String campaignName, double discount, boolean isActive) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discount = discount;
		this.isActive = isActive;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
