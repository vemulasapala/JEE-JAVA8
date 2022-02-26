package exercise2;

public class Employee {
	String fName;
	String lName;
	String phoneNumber;
	String department;
	String employeeId;
	public Employee(String fname,String lname,String phnum,String dept,String empId)  {
		this.fName=fname;
		this.lName=lname;
		this.phoneNumber=phnum;
		this.department=dept;
		this.employeeId=empId;
	}
	public String getfName() {
		return fName;
	}	
	public String getlName() {
		return lName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}	
	
	
}
