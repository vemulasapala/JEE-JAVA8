package com.cg.eis.exception;

public class EmployeeDetails {
	String fName;
	String lName;
	String phoneNumber;
	String department;
	String employeeId;
	double salary;
	public EmployeeDetails(String fname,String lname,String phnum,String dept,String empId,double sal)  {
		this.fName=fname;
		this.lName=lname;
		this.phoneNumber=phnum;
		this.department=dept;
		this.employeeId=empId;
		this.salary=sal;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
