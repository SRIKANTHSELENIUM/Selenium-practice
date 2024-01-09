package Oops_Concept;

 class AbsClass 
{ 
	public void m1() {
		System.out.println("m1 from abs class");
	}
	
	 
} 
class Subclass extends AbsClass { 
	public static void m2() {
		System.out.println("m2 from abs class");
	}	 
}
public  class  Abstraction_Demo3
	 {
public static void main(String[] args) 
{ 

  AbsClass d=new AbsClass();
  d.m1();
  
  Subclass.m2();
  
} 
}



/*public abstract class AbsClass 
{ 
 No abstract method here. 
} 

Creating a subclass that inherits Abstract class. 
public class Subclass extends AbsClass { 
public static void main(String[] args) 
{ 
   AbsClass c = new AbsClass(); // Compile-time error. 
} 
}*/