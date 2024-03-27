package learnJava;

import java.util.HashMap;

public class Collections_Map {

	public static void main(String[] args) {

		
		HashMap<Integer, String> employeeMap=new HashMap<Integer, String>();
		
		employeeMap.put(1,  "Hemanth");
		employeeMap.put(2,  "Suresh");
		employeeMap.put(3,  "Arun");
		employeeMap.put(4,  "Monish");
		employeeMap.put(5,  "Prabu");

		System.out.println("Employee Details:" + employeeMap);
		

//		Map<Integer, String> duplicateMap=new HashMap<Integer, String>();
//		duplicateMap.putAll(employeeMap);
//		System.out.println(duplicateMap);
//		
//		duplicateMap.clear();
		
		
		boolean ck = employeeMap.containsKey(1);
		System.out.println(ck);
		
		boolean value = employeeMap.containsValue("Hemanth");
		System.out.println(value);
		
		
		System.out.println("Key Set :" + employeeMap.keySet());

		System.out.println("Key Set :" + employeeMap.entrySet());
	
	}

}


