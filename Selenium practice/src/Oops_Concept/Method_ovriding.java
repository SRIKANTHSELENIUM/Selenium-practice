package Oops_Concept;
class HP{
	public void Laptop() {
		
		System.out.println("It is a good condition");
	}
}
class Access extends HP{
	public void Laptop(){
		System.out.println("Features are very good as compare access");
	}
	
}


public class Method_ovriding {

	public static void main(String[] args) {
		HP system=new Access();  //upcasting
		system.Laptop();

	}

}
