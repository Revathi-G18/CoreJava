package com.core.java.test;

import com.core.java.pgm.Address;
import com.core.java.pgm.Employee;

public class EmployeeTest {
public static void main(String[] args) {
	//Employee emp=new Employee(234,"spencer");
	//Employee emp=new ContractEmployee();
	Employee emp=new Employee();
	Address address=new Address();
	ContractEmployee cemp=new ContractEmployee();
	Employee employee1=new Employee();
	Employee employee2=new Employee();
	//employee1=employee2;
	System.out.println((employee1.equals(employee2))? true:false);
	System.out.println(employee2.hashCode());
	System.out.println(employee2);
	cemp.setId(123);
	cemp.setName("Mellisa");
	cemp.setSalary(20_000);
	cemp.setDuration(5);
	cemp.display(address);
	
	emp.display(address);
}
}
