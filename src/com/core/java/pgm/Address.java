package com.core.java.pgm;

public class Address extends Employee {
private String street,city;
private int pincode;
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public void display(){
	super.display();
	System.out.println(" ");
	//System.out.println("id: "+super.getId()+"  "+"name: "+super.getName()+"  "+"salary: "+super.getSalary()+"  "+"Duration: "+duration);
}

}
