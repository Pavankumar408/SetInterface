package com.project.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class hashset {
	public static void main(String[]args) {
		Set<String> name=new HashSet<String>();
		name.add("pavan");
		name.add("kumar");
		name.add("navven");
		name.add("karthi");
		name.add("surya");
		name.add("sathish");
		System.out.println(name.contains("pavan"));
		System.out.println(name.isEmpty());
		System.out.println(name.hashCode());
		System.out.println(name);
		for(String str:name) {
			System.out.println(str);
		}
		Iterator<String> str=name.iterator();
		while(str.hasNext()) {
			System.out.println(str.next());
		}
		
		}
		
		
	}
	


