package Oops_Concept;

class Customer{
	
	void human(){
		System.out.println("bank");
	}
	class Student extends Customer{
		void human() {
			System.out.println("school");
		}
	}
	class Salesmen extends Customer{
		void human() {
			System.out.println("shopping mall");
		}
	}
	
}


public class Poly_morph1 {

	public static void main(String[] args) {
		
		
		Customer sl=new Customer();
		sl.human();
		
		

	}

}
