package practicepack1;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    
// Use addFirst() to add the item to the beginning
//	    cars.addFirst("Mazda");
//Use addLast() to add the item to the last	    
//	    cars.addLast("Van");
//Use removeFirst() to remove first from the list
//	    cars.removeFirst();
//Use removeLast() to remove from the list
//	    cars.removeLast();
//Use getFirst() to display the first item from the list
	    System.out.println(cars.getFirst());
	    System.out.println(cars.getLast());
//	     System.out.println(cars);
        

	}

}
