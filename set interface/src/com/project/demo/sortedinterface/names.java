package com.project.demo.sortedinterface;

import java.util.SortedSet;
import java.util.TreeSet;

public class names {
	public static void main(String[]args) {
	SortedSet<String> names=new TreeSet<String>();
	names.add("pavan");
	names.add("kumar");
	names.add("sekar");
	names.add("surya");
	names.add("naveen");
	System.out.println(names);
	for(String str:names) {
		System.out.println(str);
	}
	}

}
