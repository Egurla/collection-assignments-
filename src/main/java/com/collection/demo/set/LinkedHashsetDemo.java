package com.collection.demo.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

		// 2. Add elements to LinkedHashSet
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		linkedHashSet.add("D");
		linkedHashSet.add("E");

		System.out.println(linkedHashSet);
		boolean found = linkedHashSet.contains("A"); // true
		System.out.println(found);
		linkedHashSet.remove("D");
		
		HashSet<String> hashmap=(HashSet<String>) linkedHashSet.clone();
		
		System.out.println(hashmap);
		System.out.println(linkedHashSet);
		
		Iterator<String> itr = linkedHashSet.iterator();

		while (itr.hasNext()) {
			String value = itr.next();

			System.out.println("Value: " + value);
		}
		linkedHashSet.clear();
		System.out.println(linkedHashSet);//
	}
}
