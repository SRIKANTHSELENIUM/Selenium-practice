package Oops_Concept;

class virat_anushka{
	public void cricket() {
		System.out.println("passion about it");
	}

}

class vamika extends virat_anushka {
	public void baby(){
		System.out.println("kid");

	}

}

public class Inheritance_Concept {

	public static void main(String[] args) {
		vamika shetty=new vamika();
		shetty.cricket();
		shetty.baby();
		shetty.cricket();





	}

}
