package main;

import java.util.Scanner;

public class Converter2 {

	
	
	
public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Welcome to the new select options menu: ");
		System.out.println("1. Volume Converter");
		System.out.println("2. Distance Converter");
		String menuSelection1 = scan.nextLine();
		
	while(menuSelection1 != "4") {
			
		  if( "1".equals(menuSelection1)) {
				
			//some code to call a method to work with vol converter
			  
			//String menuSelection1 = scan.nextLine(); user input for method
			  
			    if ("1".equals (menuSelection1)){
			    
			    System.out.println("Volume Converter menu:");
			    System.out.println("1 Cups to Teaspoons:");
			    System.out.println("2 US gallons to Imperial gallons:");
			    
			    
			    
			         if("2".equals(menuSelection1)){
			        System.out.println("You have picked Cups to Teaspoons:");
			         System.out.println("Enter number of cups to convert:");
			       //this line will be replaced with a method
			         String line = scan.nextLine();   
			         
			  }
			   
			        if(some condition is true ){
			          System.out.println("You have picked US gallons to Imperial gallons:");
			         System.out.println("Enter number of gallons to convert:");
			         String line = scan.nextLine();   this line will be replaced with a method
			    }
			   
			}
		  else if( "2".equals(menuSelection1)) {
			//some code to call a method to work with dis converter
			  //String menuSelection1 = scan.nextLine(); user input for method
		  }
		 	 
		  else {
			  
			  System.out.println("you have left the loop!");
			  menuSelection1 = "5";
		  }
		  
		  
		
	
	}}}

