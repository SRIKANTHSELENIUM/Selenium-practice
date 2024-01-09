package practicepack1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collections_sort {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Zeebra");
		names.add("Apple");
		names.add("Jaffa");
		names.add("jafa");
		names.add("oned plus");
		names.add("one plus");
		Collections.sort(names);
		for(String i: names) {
			System.out.println(i);
		}
		ArrayList<Integer> number=new ArrayList<Integer>();
		number.add(2067);
		number.add(156);
		number.add(6543);
		number.add(2);
		number.add(436);
		number.add(17);
		number.add(100);
		Collections.sort(number);
		for(int i:number) {
			System.out.println(i);
		}
		
	}

}
