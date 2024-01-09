package Oops_Concept;

public class StaticPoly 
{ 
 public  int sum(int x, int y) 
  { 
    int s = x + y; 
  
    return s;
  } 
void sum(int x, int y, int z) 
{ 
   int s = x + y + z; 
   System.out.println("Sum of three numbers: " +s); 
  } 
public static void main(String[] args) 
{ 
  StaticPoly obj = new StaticPoly(); 
  System.out.println(obj.sum(20, 10)); 
  int sum1=obj.sum(40, 30);
  System.out.println(sum1);
   obj.sum(10, 20, 30); 
  } 
}