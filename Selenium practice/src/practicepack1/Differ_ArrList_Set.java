package practicepack1;

import java.util.ArrayList;
import java.util.HashSet;

public class Differ_ArrList_Set {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("virat");
        list.add("ANushka");
        list.add("anushka");
        list.add("celebraty");
        System.out.println("The List data is  "+list);
        
        HashSet<String> list1=new HashSet<String>();
        list1.add("virat");
        list1.add("ANushka");
        list1.add("anushka");
        list1.add("celebraty");
        list1.add("celebraty");
        list1.add("virat");
        System.out.println("Hast Set data is    "+list1);
	}
	
	
	

}
