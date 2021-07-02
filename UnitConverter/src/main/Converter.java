package main;
import java.util.Scanner;


public class Converter {

	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Please select an option: ");
		System.out.println("1. Cups to Teaspoons");
		System.out.println("2. Miles to Kilometers");
		System.out.println("3. US Gallons to Imperial Gallons");
		System.out.println("4. Quit");
		String menuSelection1 = scan.nextLine();
		
		
		//int menuSelection = Integer.parseInt(menuSelection,0);
		
	while(menuSelection1 != "4") {
			
		  if( "1".equals(menuSelection1)) {
				
				System.out.println("You picked number:" + menuSelection1);
				System.out.println("Welcome to the Cups to Teaspoons converter how many cups do you want to convert.");
				String line1 = scan.nextLine();
				int cupTemp = Integer.parseInt(line1);

				System.out.println(line1 + " Cups are " +  (cupTemp * 48)  + " Teaspoons." );
		         System.out.println("Please enter a number 1 to 4");
		          menuSelection1 = scan.nextLine();
			}
		  else if( "2".equals(menuSelection1)) {
				System.out.println("You picked number:" + menuSelection1);
				System.out.println("Welcome to the Miles to Kilometers converter how many miles do you want to convert.");
				String line1 = scan.nextLine();
				int mileTemp = Integer.parseInt(line1);//change calculation 

				System.out.println(line1 + " Miles are " +  (mileTemp * 1.609344)   + " kilometers." );
				
				 System.out.println("Please enter a number 1 to 4");
		          menuSelection1 = scan.nextLine();
		  }
		  else if( "3".equals(menuSelection1)) {
				System.out.println("You picked number:" + menuSelection1);
				System.out.println("Welcome to the US Gallons to Imperial Gallons converter how many us gallons do you want to convert.");
				String line1 = scan.nextLine();
				int gallonTemp = Integer.parseInt(line1);//change calculation 

				System.out.println(line1 + " Gallons are " +  (gallonTemp * 0.83267384)  + " Imperial Gallons." );
				
				 System.out.println("Please enter a number 1 to 4");
		          menuSelection1 = scan.nextLine();
			}
			 
		  else {
			  
			  System.out.println("you have left the loop!");
			  menuSelection1 = "4";
		  }
		//scan.close();
		
	
	}
}
}
