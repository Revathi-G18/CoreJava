package com.core.java.pgm;

public class Employee {
private int id;
private String name;
private int salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public void display(){
	System.out.println("id: "+id+"  "+"name: "+name+"  "+"salary: "+salary);
}
 /*public Employee(int id,String name){
	 System.out.println("parameterized constructor o/p"+" "+"id:"+id+"  "+"name:"+name);
 }*/

}
