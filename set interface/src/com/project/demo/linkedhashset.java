package com.project.demo;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhashset {
	public static void main(String[]args) {
		Set<Integer> number=new LinkedHashSet<Integer>();
		number.add(34);
		number.add(45);
		number.add(56);
		number.add(78);
		number.add(89);
		number.add(90);
		number.add(78);
		number.add(90);
		System.out.println(number.contains(78));
		System.out.println(number.remove(78));
		System.out.println(number);
		for(Integer itr:number) {
			System.out.println(itr);
		}
	Iterator<Integer> itr=number.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}

}
