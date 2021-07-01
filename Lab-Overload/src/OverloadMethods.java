
public class OverloadMethods {

	
	public static void main(String[] args) {
		
		OverloadMethods om = new OverloadMethods();
		
		om.print();
		om.print("second method.");
	}
	
	
	public void print() {
		System.out.println("original print method.");
	}
	
	public void print(String str) {
		System.out.print(str);
	}
}
