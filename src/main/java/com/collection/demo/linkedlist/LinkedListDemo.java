package com.collection.demo.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import com.collection.demo.bean.Employee;

public class LinkedListDemo {
public static void main(String[] args) {
	
	LinkedList<Employee> emp=new LinkedList<Employee>();
	
	emp.add(new Employee(101, "kumar"));
	emp.add(new Employee(102, "Rakesh"));
	emp.add(new Employee(103, "Raju"));
	emp.add(new Employee(104, "kiran"));
	
	System.out.println(emp);
	
	//Display all Employee objects
			for(Employee e: emp) {
				System.out.println(e.getName()+" "+e.getEid());
				
			}
			Iterator<Employee> itr=emp.iterator();
			while(itr.hasNext()) {
				Employee e=itr.next();
				System.out.println(e.getEid()+" "+e.getName());
			}
			System.out.println(emp.get(2).getName()+" Display single employee data");
			
		ListIterator<Employee> listitr=emp.listIterator();
		while(listitr.hasPrevious()) {
			Employee ee=listitr.previous();
			System.out.println(ee.getEid()+" "+ee.getName());
		}
}
}

