package com.core.java.test;

import com.core.java.pgm.Address;
import com.core.java.pgm.Employee;

public class ContractEmployee extends Employee{
  private int duration;
  private Address address;

public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public void display(Address address){
	super.display(address);
	System.out.println("Duration: "+duration);
	//System.out.println("id: "+super.getId()+"  "+"name: "+super.getName()+"  "+"salary: "+super.getSalary()+"  "+"Duration: "+duration);
}
}
