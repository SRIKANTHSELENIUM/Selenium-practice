package Keywords_All;
class Potato3{
	
	void orange() {
		System.out.println("from northeast India");
		
	}
}
class Apple3 extends Potato3{
	void orange() {
		System.out.println("are export to other countries from kashmir");
		super.orange();
	}
}


public class super3 {

	public static void main(String[] args) {
		
Apple3 obj=new Apple3();
		
		obj.orange();
	}

}

// in this programme i want to execute parent class method so iam using here super keyword
//so it will execute both parent class and childclass 