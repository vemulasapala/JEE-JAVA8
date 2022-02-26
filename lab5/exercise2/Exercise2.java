package exercise2;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise2 exe2 = new Exercise2();
		Employee emp1= new Employee("Ram","Chowdary","+918579412031","HR manager","12HR05");
		Employee emp2= new Employee("","","+945678987545","Executive","56EX32");
		Employee emp3;
		System.out.println(emp2);
		try {
			exe2.validateName(emp2.getfName(), emp2.getlName());
		}
		catch(InvalidFullNameException e)
		{
			e.printStackTrace();
		}
		System.out.println("Employee Code After Try Catch Block");
	}
	void validateName(String fname,String lname) throws InvalidFullNameException
	{
		if(fname.isEmpty() &&  lname.isEmpty()) {
			throw new InvalidFullNameException("Please enter a valid name!!!");
		}
	}
}
