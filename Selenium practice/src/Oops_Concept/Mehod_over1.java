package Oops_Concept;

class Teacher{
	static int marks(int a,int b) {
		return (a+b);
	}
	static int marks(int a,int b,int c) {
		return (a+b+c);
	}
}


public class Mehod_over1 {

	public static void main(String[] args) {
		System.out.println(Teacher.marks(25, 52));
		System.out.println(Teacher.marks(12, 21, 32));

	}

}
