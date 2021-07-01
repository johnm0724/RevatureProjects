package Scanners;
import java.util.Scanner;



public class myScanner {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type in a line and hit Enter. ");
		
		String line = scan.nextLine();
		
		System.out.println("this is your line " + line);
		
		
		String numbers ="1 2 3 4 5 6 7 9";
		Scanner scan2 = new Scanner(numbers);
		
		while(scan2.hasNextInt()) {
			System.out.println(scan2.nextInt());
		}
		
		
		
		
		scan.close();
		scan2.close();
	}
}
