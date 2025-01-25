package mace_lab_1;

public class Appliances {


		
	private int appID;
	private String brand;
	private int quantity;
	private float wattage;
	private String colour;
	private float price;
	private String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAppID() {
		return appID;
	}
	public void setAppID(int appID) {
		this.appID = appID;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getWattage() {
		return wattage;
	}
	public void setWattage(float wattage) {
		this.wattage = wattage;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString(){
		return "ID: " + this.appID + " - Brand: " + this.brand + " - Quantity: " + this.quantity + " - Wattage: " + this.wattage + " - Colour: " + this.colour + " - Price: " + this.price;
	}

}
