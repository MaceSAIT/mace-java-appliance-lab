package mace_lab_1;

public class Vacuum extends Appliances{

	private String grade;
	private float batteryVolts;

	public String getGrade() {
		return grade;
	}






	public void setGrade(String grade) {
		this.grade = grade;
	}






	public float getBatteryVolts() {
		return batteryVolts;
	}






	public void setBatteryVolts(float batteryVolts) {
		this.batteryVolts = batteryVolts;
	}






	@Override
	public String toString(){
		return "ID: " + this.getAppID() + " - Brand: " + this.getBrand() + " - Quantity: " + this.getQuantity() + " - Wattage: " + this.getWattage() + " - Colour: " + this.getColour() + " - Price: " + this.getPrice() + " - Grade: " + this.grade + " - Voltage: " + this.batteryVolts;
	}

}
