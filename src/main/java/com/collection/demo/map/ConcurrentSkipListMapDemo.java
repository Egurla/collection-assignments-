package com.collection.demo.map;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {

	public static void main(String[] args) {
		ConcurrentSkipListMap<String, String> concurrentSkipListMap = new ConcurrentSkipListMap<String, String>();
		concurrentSkipListMap.put("1", "a");
		concurrentSkipListMap.put("2", "b");
		concurrentSkipListMap.put("3", "c");
		concurrentSkipListMap.put("4", "b");
		concurrentSkipListMap.put("5", "e");

		System.out.println("The name associated with id 1 is " + concurrentSkipListMap.get("1"));// a

		NavigableSet navigableKeySet = concurrentSkipListMap.keySet();

		System.out.println("The keys associated with this map are ");
		for (Iterator iterator = navigableKeySet.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}

		ConcurrentNavigableMap<String, String> subMap = concurrentSkipListMap.subMap("1", "3");

		NavigableSet navigableSubKeySet = subMap.keySet();

		System.out.println("submap from 1 to 3  ");

		for (Iterator subMapIterator = navigableSubKeySet.iterator(); subMapIterator.hasNext();) {
			System.out.println(subMapIterator.next());
		}

		ConcurrentNavigableMap<String, String> headerMap = concurrentSkipListMap.headMap("2");

		System.out.println("less than 2");

		NavigableSet navigableHeadMapKeySet = headerMap.keySet();

		for (Iterator headMapIterator = navigableHeadMapKeySet.iterator(); headMapIterator.hasNext();) {
			System.out.println(headMapIterator.next());
		}
	}

}
