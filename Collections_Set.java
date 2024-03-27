package learnJava;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Collections_Set {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<String>();
		set.add("Apple");
		set.add("Orange");
		set.add("Pine");
		set.add("Apple");
		set.add("Grape");
		
		int size = set.size();
		System.out.println(size);
		
//		for (String fruits : set) {
//			System.out.println(fruits);
//			
//			boolean contains = set.contains("Pine");
			
			List<String> mylist= new ArrayList<String>(set);	
			
			for (String fruits1 : set) {
				System.out.println(fruits1);

				String string = mylist.get(2);
				System.out.println(string);

			}
			
			
			
		}
	}