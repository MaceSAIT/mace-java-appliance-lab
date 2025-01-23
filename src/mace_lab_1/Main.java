package mace_lab_1;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

// C:\Users\maceh\eclipse-workspace\mace_lab_1\appliances.txt


/*
 * Written by Mace Howald on 01-18-25
 * For CPRG 304 E
 * 
 */

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner userInput = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter filepath to appliances folder, do not include quote marks.");

	    String filePath = userInput.nextLine();  // Read user input
	    System.out.println("file path is: " + filePath);  // Output user input
	    
	    try {
	        File myFile = new File(filePath); // Get the file from file path
	        Scanner fileReader = new Scanner(myFile); // Create scanner to read file
	        
	        while (fileReader.hasNextLine()) { // While reading each line
	        	
	        	String lineData = fileReader.nextLine(); // set data string to current line
	        	String[] currentApp = lineData.split(";"); // Split line at ";" and put each value into an array
	        	
	        	createAppliance(Integer.parseInt(currentApp[0]),currentApp[1],Integer.parseInt(currentApp[2]),Float.parseFloat(currentApp[3]),currentApp[4],Float.parseFloat(currentApp[5]));

	        	//System.out.println(currentApp[1]);
	        }
	        fileReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
        
	    /*
		Appliances myAppliance = new Appliances();
		myAppliance.setAppID(1);
		myAppliance.setBrand("Brand Name");
		myAppliance.setQuantity(5);
		myAppliance.setWattage(5);
		myAppliance.setColour("Green");
		myAppliance.setPrice(69);
		
		Appliances myFridge = new Refrigerator();
		System.out.println(myAppliance);
		System.out.println(myFridge);
		*/
	}
	
	
	public static void createAppliance(int id, String brand, int qty, float watts, String colour, float price) {
		
		char typeID = Integer.toString(id).charAt(0);
		//System.out.println(typeID);
		String appType;
		
		switch(typeID) {
		
			case '1':
				appType = "Fridge";
				break;
				
			case '2':
				appType = "Vaccum";
				break;
				
			case '3':
				appType = "Microwave";
				break;
				
			case '4':
			case '5':
				appType = "Dishwasher";
				break;
				
			default:
				appType = "Default";
				break;
			 
		}
		
		
		Appliances newAppliance = new Appliances();
		
		newAppliance.setAppID(id);
		newAppliance.setBrand(brand);
		newAppliance.setQuantity(qty);
		newAppliance.setWattage(watts);
		newAppliance.setColour(colour);
		newAppliance.setPrice(price);
		
		System.out.println(newAppliance);
		System.out.println(appType);
	}
	

}
