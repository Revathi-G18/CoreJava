package com.core.java.test;

import com.core.java.pgm.Employee;

public class ContractEmployee extends Employee{
  private int duration;

public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public void display(){
	super.display();
	System.out.println("Duration: "+duration);
	//System.out.println("id: "+super.getId()+"  "+"name: "+super.getName()+"  "+"salary: "+super.getSalary()+"  "+"Duration: "+duration);
}
}
