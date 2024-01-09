package Oops_Concept;
public class Inheritance_23_11b 
{ 
// Declare an instance variable, static variable and initialize values.      
   int a = 10; // non-static variable.      
   static int b = 30; // static variable.   
  
// Static method.   
   static void show()  
   {   
      System.out.println("Static method of class A");  
   } 
// Instance method.  
   void display() 
   {   
      System.out.println("Non-static method of class A");  
   } 
} 
 class B extends Inheritance_23_11b 
{   
   static int a = 20;      
   int b = 40;    
  
   void show()    
   {  
  // This statement will generate a compile time error 
  // because the instance method cannot override the static method from class A.      
     System.out.println("Non-static method of class B");   
   }    
   static void display()   
   {   
  // This statement will generate a compile time error 
  // because the static method cannot override instance method from class A.         
     System.out.println("Static method of class B");    
  } 





	public  static void main(String[] args) {
		 
			 // Create an object of class B.      
			    B obj = new B();    
			    System.out.println("Value of a: " +B.a);     
			    System.out.println("Value of b: " +obj.b);     
			    obj.show1();    
			    B.display1();   
			  } 
}

	
	

