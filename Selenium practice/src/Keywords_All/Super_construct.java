package Keywords_All;

class Abcd1234{
	Abcd1234(){
		System.out.println("p constructor");
	}
}
class Dcba4321 extends Abcd1234{
	Dcba4321(){
		super();
		System.out.println("c constructor");
	}
}



public class Super_construct {

	public static void main(String[] args) {
		Dcba4321 con=new Dcba4321();
		
		
       
	}

}

// whenever constructor is there in both parent and child class we can access the parent class 
// constructor 