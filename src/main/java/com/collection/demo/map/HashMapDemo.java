package com.collection.demo.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.collection.demo.bean.Employee;

public class HashMapDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Rakesh");

		Employee e2 = new Employee(2, "kumar");
		Employee e3 = new Employee(3, "Raju");
		Employee e4 = new Employee(4, "kiran");
		Employee e5 = new Employee(5, "deva");
		Employee e6 = new Employee(2, "kumar");

		HashMap<Employee, String> map = new HashMap<Employee, String>();
		// put keys in map
		map.put(e1, e1.getName());
		map.put(e2, e2.getName());
		map.put(e3, e3.getName());
		map.put(e4, e4.getName());
		map.put(e5, e5.getName());
		map.put(e6, e6.getName());

		System.out.println(map.get(e2));

		System.out.println(map.get(e3));

		System.out.println(map.get(e4));
		
		Collections.synchronizedMap(map);
		System.out.println(map);
		
		Set<Employee> itr=map.keySet();
	    for (Employee student : itr) {
			System.out.println(student.getName());
		}
	    
	    
	    map.entrySet().stream().forEach(e ->
	    System.out.println("Key : " + e.getKey() + " value : " + e.getValue())
	);
	    
	  //students objects converting to map to List type
	    List<Employee> keyList = new ArrayList(map.keySet());

	    //List<String> valueList = new ArrayList(map.values());
	   System.out.println("---------LIST----------");
	   for(Employee e: keyList) {
		   System.out.println(e.getEid()+" "+e.getName());
	   }
	   
	   
	   //converting the map to List using java 8
	   List<Employee> kl = map.keySet().stream().collect(Collectors.toList());
	   System.out.println("Student dat converting map to list ");
	   
	   for(Employee s: kl) {
		   System.out.println(s.getEid()+" "+s.getName());
	   }
	}
}
