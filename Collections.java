package learnJava;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Orange");
		list.add("Pine");
		list.add("Apple");
		list.add("Guava");
		
		int size = list.size();
		System.out.println("Size of list is:" + size);
		
		String string = list.get(4);
		System.out.println(string);
		
		list.remove("Apple");
		System.out.println("----------------");

		for (String fruitslist : list) {
			System.out.println(fruitslist);
			
		}
		
	}

}
