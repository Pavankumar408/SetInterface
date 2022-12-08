package com.project.demo.custom;

public class pen {
 int slno;
 String name;
 float price;
 String color;
public pen(int slno, String name, float price, String color) {
	super();
	this.slno = slno;
	this.name = name;
	this.price = price;
	this.color = color;
}
@Override
public String toString() {
	return "pen [slno=" + slno + ", name=" + name + ", price=" + price + ", color=" + color + "]";
}
 

}
