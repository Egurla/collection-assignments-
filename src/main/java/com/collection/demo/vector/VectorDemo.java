package com.collection.demo.vector;

import java.util.Enumeration;
import java.util.Vector;

import com.collection.demo.bean.Employee;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Employee> v = new Vector<Employee>();

		v.add(new Employee(101, "kumar"));
		v.add(new Employee(102, "Rakesh"));
		v.add(new Employee(103, "Raju"));
		v.add(new Employee(104, "kiran"));

		// Get Enumeration of Vector elements
		Enumeration<Employee> en = v.elements();
		/*
		 * Display Vector elements using hashMoreElements() and nextElement() methods.
		 */
		System.out.println("Vector elements are: ");
		while (en.hasMoreElements()) {

			Employee e = (Employee) en.nextElement();
			System.out.println(e.getEid() + " " + e.getName());

		}
		System.out.println(v.get(3).getEid() + " " + v.get(3).getName() + " Display single Emplyee data using index");
	}

}
