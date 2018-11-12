package com.hashmapsort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapByVal {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("abc", 1);
		hm.put("f", 100);
		hm.put("x",9);
		hm.put("b",3);
		hm.put("c", 2);
		
		System.out.println(hm);
		
		List<Map.Entry<String, Integer>> l = new LinkedList<>(hm.entrySet());
		
		Collections.sort(l, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return (o1.getValue().compareTo(o2.getValue()));
			}
		});
		
		HashMap<String, Integer> temp = new LinkedHashMap<>();
		
		for(Map.Entry<String, Integer> aa : l) {
			temp.put(aa.getKey(), aa.getValue());
		}
		
		System.out.println("After sorting by value.......");
		
		System.out.println(temp);
		
	}

}
