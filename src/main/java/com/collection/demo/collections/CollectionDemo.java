package com.collection.demo.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(12);
		list.add(4);
		list.add(16);
		list.add(18);
		Collections.swap(list, 0, 3);
		System.out.println(list);
		
		//set() method
		list.set(2, 99);
		System.out.println(list.get(3));//get the object with index
	
	Collection<Integer> collect=new LinkedList<>();
	System.out.println(collect);
	
	//add all
	collect.addAll(list);
	System.out.println(collect);
	Collections.addAll(collect, 3,4,6,8,9);
	System.out.println(collect);
	
	//using sinchronizedlist() method
	Collections.synchronizedList(list);
	System.out.println(list);
	
	//reverse() method
	Collections.reverse(list);
	System.out.println(list);
	
	//removeif()
	System.out.println(list.removeIf(x->x%2==0));
	
	//revmove() based on index
	list.remove(0);
	
	//contains
	System.out.println(list.contains(3));
	
	//containsall()
	System.out.println(list.containsAll(collect));
	
	Set<String> set=new HashSet<>();
	
	set.add("a");
	set.add("b");
	set.add("c");
	set.add("d");
	set.add("d");
	set.add("n");
	
	
	System.out.println("set elements "+set);
	
	Set<String> hashset=new HashSet<>();
	hashset.addAll(set);
	
	set.remove("d");
	System.out.println(set);
	
	//isEmpty()
	System.out.println(hashset.isEmpty());
	
	System.out.println(hashset.contains(set));
	
	hashset.removeAll(set);
	System.out.println(hashset.removeAll(set));
	
	
	System.out.println(hashset.containsAll(set));
	
	
	
	
	}
}
