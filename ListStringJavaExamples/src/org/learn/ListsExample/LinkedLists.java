package org.learn.ListsExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array List Examples

		List list=new ArrayList();
		list.add("apple");
		list.add("orange");
		list.add("orange");
		list.add("grapes");
		list.add("banana");
		System.out.println(list);

		System.out.println(list.get(0));

		System.out.println(list.indexOf("orange"));

		Iterator iterator=list.iterator();

		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("\r");
         list.remove(2);
         list.add(2, "pineapple");
		Iterator iteratorone=list.listIterator();
		while(iteratorone.hasNext()) {
			System.out.println(iteratorone.next());
		}
		System.out.println("using streams");
		list.stream().filter(a -> a.toString().startsWith("g")).forEach(x -> System.out.println(x));

		//==============================================
		System.out.println("Linked List Examples Starts");
		list=null;


	}

}
