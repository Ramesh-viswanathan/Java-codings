package learnJava;

import java.util.ArrayList;
import java.util.List;

public class collections_List_Set {

	public static void main(String[] args) {

		
		List<String> list= new ArrayList<String>();
		
		list.add("Apple");
		list.add("Orange");
		list.add("Pine");
		list.add("Apple");
		list.add("Grape");

		int size = list.size();
		System.out.println(size);
		
		
		for (String eachfruit : list) {
			System.out.println(eachfruit);
//		
			String string = list.get(2);
			System.out.println(string);
		
					
			boolean contains = list.contains("sdf");
			System.out.println(contains);
	
			
			System.out.println(size);
			
			for (String eachfruit1 : list) {
				System.out.println(eachfruit1);
			
		}
//		list.remove("Apple");
//		System.out.println(size);
//	
//		for (String eachfruit : list) {
//			System.out.println(eachfruit);
	
	}
	
}
}