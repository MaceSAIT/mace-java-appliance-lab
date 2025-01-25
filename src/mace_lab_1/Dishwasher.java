package mace_lab_1;

public class Dishwasher extends Appliances{

	private String feature;
	private String soundRating;
	
	
	




	public String getFeature() {
		return feature;
	}







	public void setFeature(String feature) {
		this.feature = feature;
	}







	public String getSoundRating() {
		return soundRating;
	}







	public void setSoundRating(String soundRating) {
		this.soundRating = soundRating;
	}







	@Override
	public String toString(){
		return "ID: " + this.getAppID() + " - Brand: " + this.getBrand() + " - Quantity: " + this.getQuantity() + " - Wattage: " + this.getWattage() + " - Colour: " + this.getColour() + " - Price: " + this.getPrice() + " - Feature: " + this.feature + " - Sound Rating: " + this.soundRating;
	}

}
