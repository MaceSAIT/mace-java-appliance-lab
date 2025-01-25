package mace_lab_1;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

// C:\Users\maceh\eclipse-workspace\mace_lab_1\src\mace_lab_1\appliances.txt


/*
 * Written by Mace Howald on 01-18-25
 * For CPRG 304 E
 * 
 */



public class Main {
	
	private static Appliances[] appliancesArray = new Appliances[100];
	private static int applianceCount = 0; // Number of appliances in the array

	public static void main(String[] args) throws IOException {
		
		
		
		Scanner userInput = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter filepath to appliances folder, do not include quote marks.");

	    String filePath = userInput.nextLine();  // Read user input
	    System.out.println("file path is: " + filePath);  // Output user input
	    
	    
	    filePath = "C:\\Users\\maceh\\eclipse-workspace\\mace_lab_1\\src\\mace_lab_1\\appliances.txt"; // For quick loading while debugging
	    
	    try {
	        File myFile = new File(filePath); // Get the file from file path
	        Scanner fileReader = new Scanner(myFile); // Create scanner to read file
	        
	        while (fileReader.hasNextLine()) { // While reading each line
	        	
	        	String lineData = fileReader.nextLine(); // set data string to current line
	        	String[] currentApp = lineData.split(";"); // Split line at ";" and put each value into an array
	        	
	        	char typeID = currentApp[0].charAt(0);
	    		//System.out.println(typeID);
	    		String appType;
	    		
	    		
	    		
	    		switch(typeID) {
	    		
	    			case '1':
	    				appType = "Fridge";	    		
	    				Appliances fridge = createFridge(Integer.parseInt(currentApp[0]),currentApp[1],Integer.parseInt(currentApp[2]),Float.parseFloat(currentApp[3]),currentApp[4],Float.parseFloat(currentApp[5]),Integer.parseInt(currentApp[6]),Float.parseFloat(currentApp[7]),Float.parseFloat(currentApp[8]));
	    				appliancesArray[applianceCount++] = fridge;
	    				break;
	    				
	    			case '2':
	    				appType = "Vaccum";
	    				Appliances vacuum = createVacuum(Integer.parseInt(currentApp[0]),currentApp[1],Integer.parseInt(currentApp[2]),Float.parseFloat(currentApp[3]),currentApp[4],Float.parseFloat(currentApp[5]),currentApp[6],Float.parseFloat(currentApp[7]));
	    				appliancesArray[applianceCount++] = vacuum;
	    				break;
	    				
	    			case '3':
	    				appType = "Microwave";
	    				Appliances microwave = createMicrowave(Integer.parseInt(currentApp[0]),currentApp[1],Integer.parseInt(currentApp[2]),Float.parseFloat(currentApp[3]),currentApp[4],Float.parseFloat(currentApp[5]),Float.parseFloat(currentApp[6]),currentApp[7]);
	    				appliancesArray[applianceCount++] = microwave;
	    				break;
	    				
	    			case '4':
	    			case '5':
	    				appType = "Dishwasher";
	    				Appliances dishwasher = createDishwasher(Integer.parseInt(currentApp[0]),currentApp[1],Integer.parseInt(currentApp[2]),Float.parseFloat(currentApp[3]),currentApp[4],Float.parseFloat(currentApp[5]),currentApp[6],currentApp[7]);
	    				appliancesArray[applianceCount++] = dishwasher;
	    				break;
	    				
	    			default:
	    				appType = "Default";
	    				createAppliance(Integer.parseInt(currentApp[0]),currentApp[1],Integer.parseInt(currentApp[2]),Float.parseFloat(currentApp[3]),currentApp[4],Float.parseFloat(currentApp[5]));
	    				break;
	    			 
	    		}
	        	
	        	
	        	//System.out.println(currentApp[1]);
	        }
	        fileReader.close();
	        
	        mainMenu();
	        
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
		
		
		Appliances newAppliance = new Appliances();
		
		newAppliance.setAppID(id);
		newAppliance.setBrand(brand);
		newAppliance.setQuantity(qty);
		newAppliance.setWattage(watts);
		newAppliance.setColour(colour);
		newAppliance.setPrice(price);
		
		System.out.println(newAppliance);
		//System.out.println(appType);
	}
	
	
	public static Appliances createFridge(int id, String brand, int qty, float watts, String colour, float price, int doorNum, float h, float w) {
	
		Refrigerator newFridge = new Refrigerator();
		
		newFridge.setAppID(id);
		newFridge.setBrand(brand);
		newFridge.setQuantity(qty);
		newFridge.setWattage(watts);
		newFridge.setColour(colour);
		newFridge.setPrice(price);
		newFridge.setDoorNumber(doorNum);
		newFridge.setHeight(h);
		newFridge.setWidth(w);
		newFridge.setType("Fridge");
	
		//System.out.println(newFridge);
		System.out.println("Fridge Added");
		return newFridge;
	}
	
	public static Appliances createVacuum(int id, String brand, int qty, float watts, String colour, float price, String grade, float volts) {
		
		Vacuum newVacuum = new Vacuum();
		
		newVacuum.setAppID(id);
		newVacuum.setBrand(brand);
		newVacuum.setQuantity(qty);
		newVacuum.setWattage(watts);
		newVacuum.setColour(colour);
		newVacuum.setPrice(price);
		newVacuum.setGrade(grade);
		newVacuum.setBatteryVolts(volts);
		newVacuum.setType("Vacuum");
	
		//System.out.println(newVacuum);
		System.out.println("Vacuum Added");
		return newVacuum;
	}
	
	public static Appliances createMicrowave(int id, String brand, int qty, float watts, String colour, float price, float capacity, String roomType) {
		
		Microwave newMicrowave = new Microwave();
		
		newMicrowave.setAppID(id);
		newMicrowave.setBrand(brand);
		newMicrowave.setQuantity(qty);
		newMicrowave.setWattage(watts);
		newMicrowave.setColour(colour);
		newMicrowave.setPrice(price);
		newMicrowave.setCapacity(capacity);
		newMicrowave.setRoomType(roomType);
		newMicrowave.setType("Microwave");
	
		//System.out.println(newMicrowave);
		System.out.println("Microwave Added");
		return newMicrowave;
	}
	
	public static Appliances createDishwasher(int id, String brand, int qty, float watts, String colour, float price, String feature, String soundRating) {
		
		Dishwasher newDishwasher = new Dishwasher();
		
		newDishwasher.setAppID(id);
		newDishwasher.setBrand(brand);
		newDishwasher.setQuantity(qty);
		newDishwasher.setWattage(watts);
		newDishwasher.setColour(colour);
		newDishwasher.setPrice(price);
		newDishwasher.setFeature(feature);
		newDishwasher.setSoundRating(soundRating);
		newDishwasher.setType("Dishwasher");
	
		//System.out.println(newDishwasher);
		System.out.println("Dishwasher Added");
		return newDishwasher;
	}


	// Main Menu Function
	public static void mainMenu() {
		
		int selection;
		Scanner userInput = new Scanner(System.in);  // Create a Scanner object
		
		System.out.println("Welcome to Modern Appliances!");
		System.out.println("How may we assist you?");
        System.out.println("-------------------------\n");
        System.out.println("1 - Check out Appliance");
        System.out.println("2 - Find Appliance by Brand");
        System.out.println("3 - Display Appliances by Type");
        System.out.println("4 - Produce Random Appliance List");
        System.out.println("5 - Quit");

        
        selection = userInput.nextInt();
        
		
		switch(selection) {
		
		case 1:
			checkout();
			break;
			
		case 2:
			findAppliance();
			break;
			
		case 3:
			displayAppByType();
			break;
			
		case 4:
			RandomApplianceList();
			break;
			
		case 5:
			System.exit(0);
			break;
			
		default:
			System.out.println("Invalid Selection");
			mainMenu();
			break;
		}
	}
	
	
	// Checkout Function
    public static void checkout() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter appliance ID to checkout:");
        int applianceID = userInput.nextInt();
        //int applianceCount = appliancesArray.size();
        
        // Search through the appliancesArray for the appliance with the matching ID
        boolean found = false;
        for (int i = 0; i < applianceCount; i++) {
            Appliances appliance = appliancesArray[i];
            if (appliance.getAppID() == applianceID) {
                found = true;
                int quantity = appliance.getQuantity();
                
                if (quantity > 0) {
                    appliance.setQuantity(quantity - 1); // Decrease the quantity by 1
                    System.out.println("You have successfully checked out one " + appliance.getBrand());
                    mainMenu(); // Return to Main Menu
                } else {
                    System.out.println("Sorry, this appliance is out of stock.");
                    mainMenu(); // Return to Main Menu
                }
                break;
            }
        }
        
        if (!found) {
            System.out.println("No appliance with ID " + applianceID + " found.");
            mainMenu(); // Return to Main Menu
        }
    }
    
    // Find appliances by brand
    public static void findAppliance() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the brand of the appliance you're looking for:");
        String brand = userInput.nextLine();
        
        boolean found = false;
        System.out.println("Searching for appliances of brand: " + brand);
        System.out.println("---------------------------------------");
        
        // Search through the array of appliances
        for (int i = 0; i < applianceCount; i++) {
            Appliances appliance = appliancesArray[i];
            if (appliance.getBrand().equalsIgnoreCase(brand)) {
                // If a match is found, display the appliance details
                System.out.println(appliance);
                System.out.println("---------------------------------------");
                found = true;
                
            }
        }
        
        
        if (!found) {
            System.out.println("No appliances found for the brand: " + brand);
            mainMenu(); // Return to Main Menu
        }else{
        	mainMenu(); // Return to Main Menu
        }
    }
    
    // Display appliances by type
    public static void displayAppByType() {
        Scanner userInput = new Scanner(System.in);
        
        // Display available types of appliances
        System.out.println("Select the type of appliance to display:");
        System.out.println("1 - Fridge");
        System.out.println("2 - Vacuum");
        System.out.println("3 - Microwave");
        System.out.println("4 - Dishwasher");
        System.out.println("5 - All Appliances");
        
        int selection = userInput.nextInt();
        
        boolean found = false;
        String selectedType = "";
        
        switch (selection) {
            case 1:
                selectedType = "Fridge";
                break;
            case 2:
                selectedType = "Vacuum";
                break;
            case 3:
                selectedType = "Microwave";
                break;
            case 4:
                selectedType = "Dishwasher";
                break;
            case 5:
                selectedType = "All";
                break;
            default:
                System.out.println("Invalid Selection");
                displayAppByType(); // Restart menu
                return;
        }
        
        // Display appliances based on the selected type
        System.out.println("Displaying appliances of type: " + selectedType);
        for (int i = 0; i < applianceCount; i++) {
            Appliances appliance = appliancesArray[i];
            
            if (selectedType.equals("All") || appliance.getType().equalsIgnoreCase(selectedType)) {
                // Display appliance details
                System.out.println("Appliance ID: " + appliance.getAppID());
                System.out.println("Brand: " + appliance.getBrand());
                System.out.println("Type: " + appliance.getType());
                System.out.println("Quantity: " + appliance.getQuantity());
                System.out.println("Price: $" + appliance.getPrice());
                System.out.println("---------------------------------------");
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No appliances found for the type: " + selectedType);
            mainMenu(); // Return to Main Menu
        }else{
        	mainMenu(); // Return to Main Menu
        }
    }

    
    
    public static void RandomApplianceList() {
        Scanner userInput = new Scanner(System.in);
        
        // Ask the user for the number of random appliances to display
        System.out.println("How many random appliances would you like to display?");
        int numAppliances = userInput.nextInt();
        
        // Check if the requested number is greater than the number of appliances available
        if (numAppliances > applianceCount) {
            System.out.println("There are only " + applianceCount + " appliances available.");
            RandomApplianceList(); // Restart menu
        }
        
        Random random = new Random();
        
        System.out.println("Displaying " + numAppliances + " random appliances:");
        
        // Keep track of which appliances have already been shown (to avoid repeats)
        boolean[] shown = new boolean[applianceCount];
        
        for (int i = 0; i < numAppliances; i++) {
            int randomIndex;
            
            // Ensure we pick an appliance that hasn't already been shown
            do {
                randomIndex = random.nextInt(applianceCount);
            } while (shown[randomIndex]);
            
            shown[randomIndex] = true;  // Mark this appliance as shown
            
            Appliances appliance = appliancesArray[randomIndex];
            
            // Display the details of the randomly selected appliance
            System.out.println(appliance);
        }
        
        mainMenu(); // Return to Main Menu
    }

}
