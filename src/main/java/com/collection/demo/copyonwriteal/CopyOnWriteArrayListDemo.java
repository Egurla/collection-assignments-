package com.collection.demo.copyonwriteal;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	
	public static void main(String[] args) {
		
		//thread safe and implemets to Randamacces ,cloneable and serializable (marker interfce) interface
		CopyOnWriteArrayList<String> cwal=new CopyOnWriteArrayList<String>();
		
		cwal.add("rajesh");
		cwal.add("krishna");
		cwal.add("kumar");
		cwal.add("chinna");
		cwal.add("kumar");
		
		System.out.println(cwal);
		
		Iterator<String> itr1 = cwal.iterator();
		
		itr1.forEachRemaining(System.out :: println);
		cwal.add("asdd");
		
		System.out.println("--------------");
		 
		Iterator<String> itr2 = cwal.iterator();
		 
		itr2.forEachRemaining(System.out :: println);
		
	}

}
