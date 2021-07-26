package com.collection.demo.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import com.collection.demo.bean.Employee;
import com.collection.demo.bean.Student;

import java.util.Map.Entry;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Student> studentObj = new ArrayList<Student>();

		Student student1 = new Student(101, "Mahu", "ECE");
		Student student2 = new Student(101, "Mahu", "ECE");
		Student student3 = new Student(103, "sitara", "IT");
		Student student4 = new Student(104, "rakesh", "EEE");
		Student student5 = new Student(105, "mahesh", "CSC");

		// add Student objects in the ArrayList
		studentObj.add(student1);
		studentObj.add(student2);
		studentObj.add(student3);
		studentObj.add(student4);
		studentObj.add(student5);

		
		
		Comparator<Student> c = new Comparator<Student>() {
            public int compare(Student s1, Student s2)
            {
                return s1.getName().compareTo(s2.getName());
            }
        };
		int indexnum=Collections.binarySearch(studentObj, student1,c);
		System.out.println("Using binarysearch "+indexnum);
		// Display all student data
		for (Student s : studentObj) {
			System.out.println(s.getName() + " " + s.getSid() + " " + s.getSbranch());
		}
		// using index to get the data
		System.out.println(studentObj.indexOf(student2.getName()));
		System.out.println(studentObj.get(3).getName() + "---->getting the data from student");

		// Display all student data with itetator
		Iterator<Student> itr = studentObj.iterator();
		while (itr.hasNext()) {
			Student s = itr.next();
			System.out.println(s.getName()+ " " + s.getSbranch() + " " + s.getSid());
		}
		// Usining ListIterator
		ListIterator<Student> litr = studentObj.listIterator();

		// Display all student data forword direction
		while (litr.hasNext()) {
			Student s1 = litr.next();
			System.out.println(s1.getName() + " " + s1.getSbranch() + " " + s1.getSid());
		}
		// Display student data backowrd direction with using previous() method
		while (litr.hasPrevious()) {
			Student s2 = litr.previous();
			System.out.println(s2.getName() + " " + s2.getSbranch() + "--- " + s2.getSid());

		}

		
		//to converting set
		Set<Student> hSet = new HashSet<Student>(studentObj);

		System.out.println("Created HashSet is");
		for (Student s : hSet) {
			System.out.println(s.getName() + "-" + s.getSid() + "-" + s.getSbranch());
		}

		
		// converting List to Map type

		Map<Integer, String> map1 = new HashMap<>();
		// put every value list to Map
		for (Student st : studentObj) {
			map1.put(st.getSid(), st.getName());

		}
		System.out.println(" converting LIst to MAp");
		Set<Entry<Integer, String>> set = map1.entrySet();
		for (Entry<Integer, String> s : set) {
			Integer st = s.getKey();
			System.out.println(st + " " + s.getValue());
		}
	}
}
