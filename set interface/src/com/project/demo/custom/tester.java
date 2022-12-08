package com.project.demo.custom;

import java.util.HashSet;
import java.util.Set;

public class tester {
	public static void main(String[]args) {
		pen pen =new pen(1,"renolds",5,"blue");
		pen pen1=new pen(2,"cellow",8,"black");
		Set<pen> details=new HashSet<pen>();
		details.add(pen);
		details.add(pen1);
		//details.add(new pen(1,"renolds",8,"blue"));
		//details.add(new pen(2,"cellow",6,"black"));
		//System.out.println(pen);
	//	System.out.println(pen1);
		System.out.println(details);
	}

}
