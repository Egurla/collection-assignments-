package com.collection.demo.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.collection.demo.bean.Employee;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Employee> set = new HashSet<Employee>();

		set.add(new Employee(101, "kumar"));
		set.add(new Employee(102, "Rakesh"));
		set.add(new Employee(103, "Raju"));
		set.add(new Employee(104, "kiran"));
		set.add(new Employee(103, "Raju"));
		set.add(new Employee(103, "kiran"));
		set.add(new Employee(102, "Rakesh"));

		System.out.println(set.size());// 5

		Iterator<Employee> itr = set.iterator();

		while (itr.hasNext()) {
			Employee e = itr.next();
			System.out.println(e.getEid() + " " + e.getName());
		}

		// converting set to list
		List<Employee> list = set.stream().collect(Collectors.toList());
		list.forEach(System.out::println);
		// list.forEach(System.out.println());

		Map<Integer, String> map = set.stream().distinct()
				.collect(Collectors.toMap(Employee::getEid, Employee::getName, (x, y) -> x + ", " + y));

		map.forEach((x, y) -> System.out.println(x + " " + y));

	}

}
