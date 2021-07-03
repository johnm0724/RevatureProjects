package main;

import java.util.Scanner;




public class Converter2 {

	
	VolCon vc = new VolCon();
	DisCon dc = new DisCon();
	
public static void main(String[] args){
		Converter2 con = new Converter2();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Welcome to the new select options menu: ");
		System.out.println("1. Volume Converter");
		System.out.println("2. Distance Converter");
		String menuSelection1 = scan.nextLine();
		
	while(menuSelection1 != "3") {
			
		  if( "1".equals(menuSelection1)) {  
			    System.out.println("Volume Converter menu:");
			    System.out.println("1. Cups to Teaspoons:");
			    System.out.println("2. US gallons to Imperial gallons:");
			    String line = scan.nextLine();
			    
			   
			         if("1".equals(line)){
			            System.out.println("You have picked Cups to Teaspoons:");
			            System.out.println("Enter number of cups to convert:");
			           //this line will be replaced with a method
			            String line1 = scan.nextLine();
			            con.vc.cup(line1);
			           }
			         else if("2".equals(line) ){
			            System.out.println("You have picked US gallons to Imperial gallons:");
			            System.out.println("Enter number of gallons to convert:");
			            String line1 = scan.nextLine();  
			            con.vc.gallons(line1);
			            }
			    
		              
		  }
		 else if( "2".equals(menuSelection1)) {
			   
    	         System.out.println("Welcome to Distance Converter");
    	         System.out.println("Enter the number of miles to convert:");
    	         String line2 = scan.nextLine();
    	         con.dc.miles(line2);
		  }
		  
		  
		
	
		  }}}

