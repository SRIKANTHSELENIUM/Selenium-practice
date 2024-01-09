package Oops_Concept;

public class Encapsl_ation {
	
	
		  private String name; // private = restricted access

		  // Getter
		  public String getName() {
		    return name;
		  }

		  // Setter
		  public void setName(String newName) {
		    this.name = newName;
		  }
		

	  public static void main(String[] args) {
		  Encapsl_ation myObj = new Encapsl_ation();
	    myObj.setName("siri"); // Set the value of the name variable to "John"
	    System.out.println(myObj.getName());
	  }
	}
	
	

