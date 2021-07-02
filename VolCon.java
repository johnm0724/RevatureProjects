package main;




public class VolCon {

	
	public void cup(String input) {
		
	  
     int cupTemp = (Integer.parseInt(input ) * 48);
	    
	    System.out.println( input + "cup(s) converts to " + cupTemp + " Teaspoon"  );
	}
	
	public void gallons(String input) {
	
	  int gallonTemp = (int) (Integer.parseInt(input) * 0.83267384);
	   System.out.println( input + " gallon(s) converts to " + gallonTemp + "Imperial gallons");
	
	}
}


