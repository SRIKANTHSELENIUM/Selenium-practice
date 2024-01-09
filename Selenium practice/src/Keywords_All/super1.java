package Keywords_All;
class Potato{
	
	void orange() {
		System.out.println("from northeast India");
		
	}
}
class Apple extends Potato{
	void simla() {
		System.out.println("are export to other countries from kashmir");
	}
}

public class super1 {

	public static void main(String[] args) {
		
		Apple obj=new Apple();
		obj.simla();
		obj.orange();
		

	}

}
