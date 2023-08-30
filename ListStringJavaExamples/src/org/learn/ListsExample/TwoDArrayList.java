package org.learn.ListsExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoDArrayList {
	
	public void processing(String[][] input) {
		HashSet ns=new HashSet();
		List<ArrayList> nual=new ArrayList();
		ArrayList<ArrayList> wal=new ArrayList();
		HashMap<String,ArrayList> hm=new HashMap();
		//nual=Arrays.asList(input);
		//System.out.println("Al Value"+nual); 
		
		  for(int i=0;i<input.length;i++) {
		  //System.out.println("Length Output"+input.length); 
			  ns.add(input[i][0]);
		  //nual.add(input[i][1]);
			  hm.put(input[i][0], null);
		 // if(hm.containsKey(input[i][0])) { nual.add(input[i][1]); } 
		  }
		 //Map
		 for(int i=0;i<hm.size();i++) {
			 wal.add(new ArrayList());
			 nual.add(new ArrayList());
		 }
		 //System.out.println("Test "+ hm.getK);
		// for(int i=0;i<hm.size();i++) {
		 int m=0;
		    for (String name : hm.keySet()) {
	            //System.out.println("key: " + name);
			 for(int j=0;j<input.length;j++) {
				 if(name.equals(input[j][0])) {
					 wal.get(m).add(Integer.parseInt(input[j][1]));
				 }
			 }
			 m=m+1;
		 }
		    for(int k=0;k<wal.size();k++) {
		    	nual.get(k).add(Collections.max(wal.get(k)));
		    	nual.get(k).add(Collections.min(wal.get(k)));
		    	// hm.replace(null, null, null);
		    	
		    }
		 System.out.println("Multidimensional Array "+ wal);
		 System.out.println("Refined Multidimensional Array "+ nual);
		 //System.out.println("Map "+hm.);
		 int j=0;
		 for(String entr : hm.keySet()) {
			hm.put(entr, nual.get(j));
			 j=j+1;
		 }
		 System.out.println("Output "+ hm);
		/*
		 * System.out.println("Set Value"+ns); System.out.println("Map Value"+hm);
		 * //System.out.println("Al Value"+nual); Iterator iterator=ns.iterator();
		 * while(iterator.hasNext()) for(int i=0;i<input.length;i++) {
		 * if(iterator.next().equals(input[i][0])) { } }
		 */
	}
	public static void main(String[] args) {
		String[][] input={{"Rahul","29","10"},{"Mohan","26","10"},{"Rahul","27","10"},{"Rahul","26","10"},{"Mohan","36","10"},{"Mohan","2","10"}	};
		 
		TwoDArrayList Twod= new TwoDArrayList();
		Twod.processing(input);
}
}