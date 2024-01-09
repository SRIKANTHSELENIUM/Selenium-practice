package Keywords_All;
class Potato4{
	private String java="Eclipse";
	private String more="you";
	Potato4(){
		
		System.out.println(" p constructor");
	}
	
	
	
}
class Apple4 extends Potato4{
	
	 private String java="Selenium";
	private  String more="core";
	
	Apple4(){
		super();
		System.out.println(super.java);
	}
	
	void orange() {
		
		
		System.out.println("c constructor");
//		System.out.println(java);
		System.out.println(super.java);
		System.out.println(super.more);
		
		
	}
}
public class Super4 {

	public static void main(String[] args) {
Apple4 obj=new Apple4();
		
		obj.orange();

	}

}
