package com.collection.demo.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

import com.collection.demo.bean.Student;

public class TreemapDemo {

	public static void main(String[] args) {
		NavigableMap<Student, String> map=new TreeMap<Student, String>();
		
		Student s1 = new Student(1, "Rakesh","ece"); 
		  
	    Student s2 = new Student(2, "kumar","cse"); 
	    Student s3 = new Student(3, "Raju","eee");
	    Student s4 = new Student(4, "kiran","mech");
	    Student s5 = new Student(5, "deva","ece");
	    Student s6 = new Student(2, "kumar","it");
	    
	    map.put(s1, s1.getName());
	    map.put(s2, s2.getName());
	    map.put(s3, s3.getName());
	    map.put(s4, s4.getName());
	    map.put(s5, s5.getName());
	    map.put(s6, s6.getName());
	   
		/*
		 * for (Map.Entry<Student, String> entry : map.entrySet()) {
		 * System.out.println("Key : " +
		 * entry.getKey().getSid()+","+entry.getKey().getName() + " value : " +
		 * entry.getValue()); }
		 */
	    
	   map.descendingMap();
	   System.out.println(map);
	    System.out.println();
	    map.entrySet().stream().forEach(e ->
	    System.out.println("Key : " + e.getKey() + " value : " + e.getValue())
	);
	}
}
