package com.collection.demo.map;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
	
	public static void main(String[] args) {
		Map<Integer, String> hashtable=new Hashtable<Integer, String>();
		
		hashtable.put(1, "kumar");
		hashtable.put(5, "rakesh");
		hashtable.put(4, "kumar");
		hashtable.put(3, "chinna");
		hashtable.put(5, "rama");
		hashtable.put(6, "raju");
		hashtable.put(9, "suman");
		System.out.println(hashtable);	
		
		
	}

}
