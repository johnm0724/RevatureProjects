package LabRecursion;

public class Fib {

	
	public int fibonacci(int num) {
		//base case where if the position is 0 or 1 it will return 0 or 1 
		if(num == 0 ) return 0;
		if(num == 1) return 1;
		
		//the returning of the two positions being adding while it counts 
		return fibonacci(num -1 ) + fibonacci(num - 2); 
	}
	
}
