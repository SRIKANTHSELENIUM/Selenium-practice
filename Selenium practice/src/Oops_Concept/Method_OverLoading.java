package Oops_Concept;

public class Method_OverLoading {
	void sum(int a,long b){

		System.out.println(a+b);
	}  

  void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);

	}


	public static void main(String[] args) {

		Method_OverLoading obj=new Method_OverLoading();
		
		obj.sum(44,24);
		obj.sum(23, 67, 123);
	}

}
