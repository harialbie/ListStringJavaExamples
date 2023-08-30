package org.learn.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r=Runtime.getRuntime();
		System.out.println("Total Memory"+r.totalMemory());
		System.out.println("Free Memory"+r.freeMemory());
		HashSet hashset=new HashSet();
		hashset.add("capsicum");
		hashset.add("potato");
		hashset.add("potato");
		hashset.add("tomato");
		hashset.add(null);
		hashset.add("beans");
		hashset.add("beetroot");
		
		System.out.println("The given set is:"+hashset);
		
		//=====================================Treeset--sort in it's natural order=======
		TreeSet treeset=new TreeSet();
		treeset.add("aliens");
		treeset.add("youth");
		treeset.add("faith");
		treeset.add("back");
		treeset.add("backbench");
		
		
		System.out.println(treeset);
		
		treeset.remove("aliens");
		System.out.println(treeset);
		treeset=null;
		hashset=null;
		System.out.println("Free Memory"+r.freeMemory());
		//r.gc();
		System.out.println("Free Memory"+r.freeMemory());

	}

}
