package com.collection.demo.concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> concurrentmap = new ConcurrentHashMap<>();

		concurrentmap.put("kumar", 12);
		concurrentmap.put("mallesh", 12);
		concurrentmap.put("rana", 12);
		concurrentmap.put("ramu", 17);
		concurrentmap.put("kumar", 12);
		concurrentmap.put("rajesh", 19);
		concurrentmap.put("chinna", 14);

		System.out.println(concurrentmap.isEmpty());// false
		System.out.println(concurrentmap.size());// 6
		System.out.println(concurrentmap.containsValue(17));// true
		System.err.println(concurrentmap.containsKey("kumar"));// true
		System.out.println("---" + concurrentmap.replace("rajesh", 19, 23));//
		System.err.println(concurrentmap.get("ramu"));// 17
		System.out.println("----" + concurrentmap.putIfAbsent("kumar", 89));

		concurrentmap.putIfAbsent("kumar", 67);

		concurrentmap.remove("asd", 13);

		// Now we can add Hello
		concurrentmap.putIfAbsent("rajyu", 12);

		// We cant replace Hello with For
		concurrentmap.replace("ramu", 17, 89);
		System.out.println(concurrentmap);

		ConcurrentHashMap<String, Integer> conhm = new ConcurrentHashMap<String, Integer>();

		conhm.put("as", 32);
		conhm.put("ss", 52);
		conhm.put("ad", 92);
		conhm.put("rr", 79);

		/*
		 * conhm.forEach( (key, value) -> concurrentmap.merge( key, value, (v1, v2) ->
		 * v1.equals(v2)?v1:v1+" "+v2);
		 */

		// remap the values of ConcurrentHashMap using compute method
		conhm.compute("ss", (key, val) -> val + 100);
		conhm.compute("rr", (key, val) -> val + 212);

		System.out.println(conhm);

		Iterator<ConcurrentHashMap.Entry<String, Integer>> itr = conhm.entrySet().iterator();
		while (itr.hasNext()) {
			ConcurrentHashMap.Entry<String, Integer> entry = itr.next();
			conhm.put("rrr", 101);
			conhm.remove("ss");
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

		}
	}
}
