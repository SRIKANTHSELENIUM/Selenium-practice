package Keywords_All;

//implementation of abstraction through abstract class 
abstract class Animal {
	abstract void walk();
	
	

	Animal() {
		System.out.println("An Animal is going to be created.");
	}
}

class Cow extends Animal {
	Cow() {
		System.out.println("You have created a Cow");
	}

	
 	public void walk() {
		System.out.println("Cow is walking.");
	}
}

class Goat extends Animal {
	 Goat() {
		System.out.println("You have created a Goat");
	}

}

public class Todat12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cow cow = new Cow();
		cow.walk();
		
	}

}
