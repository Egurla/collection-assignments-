package com.collection.demo.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.collection.demo.bean.Employee;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String>  al=new ArrayList<>();
		al.add("krishna");
		al.add("kumar");
		al.add("rajesh");
		al.add("rajesh");
		al.add("krishna");
		
		al.set(3, "asss");
		System.out.println("arraylist object "+al);
		System.out.println(Collections.frequency(al, "kumar"));
		System.out.println("using get() method "+al.get(3));//rajesh
		
		//converting synchronizedlist by using synchronizedList() method
		List<String>  synchronizedlist=Collections.synchronizedList(al);
		System.out.println(synchronizedlist);
		
		System.out.println(al.lastIndexOf("krishna")+" "+al.indexOf("krishna"));
		
		//reverese list
		Collections.reverse(al);
		al.remove(4);
		System.out.println(al);
		
		
		//Using sort method
		Collections.sort(al);
		System.out.println(al);
		System.out.println(al.size());//5	
		
		
		int index=Collections.binarySearch(al, "rajesh");
		System.out.println(index);
		
	}
}
