package com.collection.demo.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreemapTest {
public static void main(String[] args) {
	 Map<Integer, String> tmap = new TreeMap<Integer, String>();

      tmap.put(1, "Data1");
      tmap.put(23, "Data2");
      tmap.put(70, "Data3");
      tmap.put(4, "Data4");
      tmap.put(2, "Data5");
      
      Set<Map.Entry<Integer,String>> set = tmap.entrySet();
      Iterator<Map.Entry<Integer,String>> iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry<Integer,String> mentry =iterator.next();
         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
}
      for(Map.Entry<Integer,String> e:set) {
    	  System.out.println(e.getKey()+" "+e.getValue());
      }
      tmap.remove(23);
      System.out.println(tmap);
      System.out.println(tmap.get(2));
      
     System.out.println(tmap.containsValue("data4")); 
}
}
