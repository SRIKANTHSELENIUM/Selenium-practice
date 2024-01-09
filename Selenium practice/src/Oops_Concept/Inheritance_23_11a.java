package Oops_Concept;
// creating a super class
 class Big{
	void features() {
		System.out.println("Feature A");
		System.out.println("Feature B");
	}
	
}
//creating a subclass
class Small extends Big{
	void ownFeatures() {
		System.out.println("Feature c");
		
	}
}

public class Inheritance_23_11a {
	

	public static void main(String[] args) {
		//create an object for parent class          
	    Small d =new Small() ;
	   d.ownFeatures();
	    d.features();
	    
	    

	 

	}

}
