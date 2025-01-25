package mace_lab_1;

public class Microwave extends Appliances{

	private float capacity;
	private String roomType;
	
	




	public float getCapacity() {
		return capacity;
	}






	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}






	public String getRoomType() {
		return roomType;
	}






	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}






	@Override
	public String toString(){
		return "ID: " + this.getAppID() + " - Brand: " + this.getBrand() + " - Type: " + this.getType() + " - Quantity: " + this.getQuantity() + " - Wattage: " + this.getWattage() + " - Colour: " + this.getColour() + " - Price: " + this.getPrice() + " - Capacity: " + this.capacity + " - Room Type: " + this.roomType;
	}

}
