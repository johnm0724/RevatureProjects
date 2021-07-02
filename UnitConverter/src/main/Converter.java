package main;
import java.util.Scanner;


public class Converter {

	
	public static void main(String[] args){
		// my scanner
		Scanner scan = new Scanner(System.in);
		
		//menu options 
		System.out.println("Please select an option: ");
		System.out.println("1. Cups to Teaspoons");
		System.out.println("2. Miles to Kilometers");
		System.out.println("3. US Gallons to Imperial Gallons");
		System.out.println("4. Quit");
		String menuSelection1 = scan.nextLine();
		
		
		//while in this loop you can convert cups to teaspoons etc... long as you press a number from 1 - 4 
	while(menuSelection1 != "4") {
			//if scanner input equals 1 exc 
		  if( "1".equals(menuSelection1)) {
				//C/T menu 
				System.out.println("You picked number:" + menuSelection1);
				System.out.println("Welcome to the Cups to Teaspoons converter how many cups do you want to convert.");
				//user put in number to be converted
				String line1 = scan.nextLine();
				//takes input and turns it in to an int
				int cupTemp = Integer.parseInt(line1);
              //  prints out the final ans
				System.out.println(line1 + " Cups are " +  (cupTemp * 48)  + " Teaspoons." );
				//can pick new converter or redo the same one
		         System.out.println("Please enter a number 1 to 4");
		          menuSelection1 = scan.nextLine();
			}
		//if scanner input equals 2 exc 
		  else if( "2".equals(menuSelection1)) {
			//M/K menu
				System.out.println("You picked number:" + menuSelection1);
				System.out.println("Welcome to the Miles to Kilometers converter how many miles do you want to convert.");
				//user put in number to be converted
				String line1 = scan.nextLine();
				int mileTemp = Integer.parseInt(line1);//change calculation 
				 //  prints out the final ans
				System.out.println(line1 + " Miles are " +  (mileTemp * 1.609344)   + " kilometers." );
				//can pick new converter or redo the same one
				 System.out.println("Please enter a number 1 to 4");
		          menuSelection1 = scan.nextLine();
		  }
		//if scanner input equals 3 exc 
		  else if( "3".equals(menuSelection1)) {
			//USG/IMG menu
				System.out.println("You picked number:" + menuSelection1);
				System.out.println("Welcome to the US Gallons to Imperial Gallons converter how many us gallons do you want to convert.");
				//user put in number to be converted
				String line1 = scan.nextLine();
				int gallonTemp = Integer.parseInt(line1);//change calculation 
			//  prints out the final ans
				System.out.println(line1 + " Gallons are " +  (gallonTemp * 0.83267384)  + " Imperial Gallons." );
				//can pick new converter or redo the same one
				 System.out.println("Please enter a number 1 to 4");
		          menuSelection1 = scan.nextLine();
			}
			 
		  else {
			  //you have left the loop
			  System.out.println("you have left the loop!");
			  menuSelection1 = "4";
			  scan.close();
		  }
		
		
	
	}
}
}
