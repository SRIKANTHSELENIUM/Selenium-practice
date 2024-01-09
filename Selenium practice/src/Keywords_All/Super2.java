package Keywords_All;
class Potato1{
	
	void orange() {
		System.out.println("from northeast India");
		
	}
}
class Apple1 extends Potato1{
	void orange() {
		System.out.println("are export to other countries from kashmir");
	}
}


public class Super2 {

	public static void main(String[] args) {
		Apple1 obj=new Apple1();
		
		obj.orange();
		

	}

}

// whenever by using childclass obj we can print child class method by call
// where method name is same in both parent class and child class so the child class 
//obj is execute child class method onlly 