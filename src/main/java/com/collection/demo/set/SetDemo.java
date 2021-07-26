package com.collection.demo.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(30);
		set.add(40);
		set.add(40);
		set.add(30);
		System.out.println(set.size());//4
		
		
		
		//Using Navigable set
		NavigableSet<Integer> ns = new TreeSet<>();
        ns.add(0);
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        ns.add(6);
 
        
        NavigableSet<Integer> reverseNs = ns.descendingSet();
        System.out.println("Normal order: " + ns);
        System.out.println("Reverse order: " + reverseNs);
 
        NavigableSet<Integer> threeOrMore = ns.tailSet(3, true);
        System.out.println("3 or  more:  " + threeOrMore);
        System.out.println("lower(3): " + ns.lower(3));
        System.out.println("floor(3): " + ns.floor(3));
        System.out.println("higher(3): " + ns.higher(3));
        System.out.println("ceiling(3): " + ns.ceiling(3));
 
        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);
 
        System.out.println("pollLast(): " + ns.pollLast());
        System.out.println("Navigable Set:  " + ns);
 
        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);
 
        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);
        System.out.println("pollLast(): " + ns.pollLast());
	}
}
