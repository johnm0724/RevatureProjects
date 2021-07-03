package one;
import two.Person;
import two.ProtectedSubClass;
public class AccessModifiers {

	
	public static void main(String[] args) {
		
		
		Person john = new Person();
		
		john.age = 68;
		System.out.println(john.age);
		
		ProtectedSubClass psc = new ProtectedSubClass();
		psc.printID();
		
	}
}
