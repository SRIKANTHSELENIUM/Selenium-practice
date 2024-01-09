package Oops_Concept;
class Addition{
	static int add(int a,int b) {
		
		return (a+b);
	}
	static double add(double a,double b) {
		return (a+b);
	}
}





public class Method_oveData {

	public static void main(String[] args) {
		
		System.out.println(Addition.add(999, 111));
		System.out.println(Addition.add(2.5, 2.5));

	}

}
