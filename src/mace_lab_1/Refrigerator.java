package mace_lab_1;

public class Refrigerator extends Appliances{

	private int doorNumber;
	private float height;
	private float width;
	
	
	
	
	public int getDoorNumber() {
		return doorNumber;
	}




	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}




	public float getHeight() {
		return height;
	}




	public void setHeight(float height) {
		this.height = height;
	}




	public float getWidth() {
		return width;
	}




	public void setWidth(float width) {
		this.width = width;
	}




	@Override
	public String toString(){
		return "ID: " + this.getAppID() + " - Brand: " + this.getBrand() + " - Type: " + this.getType() + " - Quantity: " + this.getQuantity() + " - Wattage: " + this.getWattage() + " - Colour: " + this.getColour() + " - Price: " + this.getPrice() + " - Doors: " + this.doorNumber + " - Height: " + this.height + " - Width: " + this.width;
	}

}
