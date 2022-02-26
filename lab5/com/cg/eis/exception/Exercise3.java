package com.cg.eis.exception;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise3 exe3 = new Exercise3();
		EmployeeDetails emp2 = new 
				EmployeeDetails("Kalam","Chandra","+918754916023","Enteertainment","5412EN",2500);
		EmployeeDetails emp1 = new 
				EmployeeDetails("Ram","Chandra","+918754916023","Enteertainment","5412EN",3500);
		try {
			exe3.validateSalary(emp1.getSalary());
		}
		catch(EmployeeException e){
			e.printStackTrace();
		}
		finally {
			System.out.println("After the Employee declration");
		}
	}
	void validateSalary(double salary) throws EmployeeException
	{
		if(salary<3000) throw new EmployeeException("EmployeeException for Salary");
	}

}
