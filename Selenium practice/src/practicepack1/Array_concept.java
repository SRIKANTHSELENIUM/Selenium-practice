package practicepack1;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Array_concept {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000);
		numbers.add(10);
		numbers.add(10000);
          for(int i:numbers) {
        	  System.out.println(i);
          }
	}

}
