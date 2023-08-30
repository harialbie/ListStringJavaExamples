package org.learn.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(0, "A");
		map.put(1, "B");
		map.put(2, "C");
		map.put(3, "D");
		map.put(4, "E");

		System.out.println(map);
		System.out.println(map.keySet());

		System.out.println(map.values());

		for(Map.Entry mapone:map.entrySet()) {

			System.out.println(mapone.getKey()+" And value "+mapone.getValue());

		} 
	}
}