package practicepack1;

import java.util.HashSet;
import java.util.Iterator;

public class HasSEt_1 {

	public static void main(String[] args) {
		  //Creating HashSet and adding elements  
	   HashSet<String> set=new HashSet<String>();
	           set.add("One");    
	           set.add("Two");    
	           set.add("Three");   
	           set.add("Four");  
	           set.add("Five");    
	           Iterator<String> i=set.iterator();  
	           while(i.hasNext())  
	           {  
	           System.out.println(i.next());  //the elements iterate in an unordered collection.
	           } 
	           
	           
	 

//ignoring dublicate elements
	
	
	/*HashSet<String> set=new HashSet<String>();  
	  set.add("Ravi");  
	  set.add("Vijay");  
	  set.add("Ravi");  
	  set.add("Ajay");  
	  //Traversing elements  
	  Iterator<String> itr=set.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  } */
	  
	 }  
	}  
	



