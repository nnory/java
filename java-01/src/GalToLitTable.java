/*
 * Try this 1-2
 * 
 * This program displays a conversion
 * table of gallons to liters.
 * 
 * Call this program "GalToLitTable.java"
 */
class GalToLitTable {
	public static void main(String args[]){
		double gallons, liters;
		int counter;
		
		counter = 0; // Line counter is initially set to 0.
		for (gallons = 1; gallons <= 100; gallons++){
			liters = gallons * 3.7854; // convert to liters.
			System.out.println(gallons + " gallons is " + 
			liters + " liters.");
			
			counter++; // Increment the line counter with each loop iteration
			// every 10th line, print a blank line
			if (counter == 10){
				System.out.println();
				counter = 0; // Reset the line counter
			}
		}
	}
}