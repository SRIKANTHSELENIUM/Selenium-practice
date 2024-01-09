package Oops_Concept;

public class Method_Over {
	public int sum1(int x,int y) {
		return(x+10);
	}
	public int sum1(int x,int y,int z) {
		return(x+y+z);
	}
	public double sum1(double x,double y) {
		return(x+y);
	}

	public static void main(String[] args) {
		Method_Over obj=new Method_Over();
		System.out.println(obj.sum1(10, 20));
		System.out.println(obj.sum1(20, 25, 25));
		System.out.println(obj.sum1(10.9, 10.9));

	}

}
