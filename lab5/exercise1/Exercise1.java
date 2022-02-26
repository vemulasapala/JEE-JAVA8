package exercise1;

public class Exercise1 {

	public static void main(String[] args) {
		Exercise1 exe1=new Exercise1();
		// TODO Auto-generated method stub
		Person p1=new Person("Ram",14);
		Person p2 = new Person("Shyam",25);
		try {
			exe1.validateAge(p1.getPersonAge());
		}
		catch(InvalidAgeException e) {
			e.printStackTrace();
		}
		System.out.println("After Try Catch Block");
	}
	void validateAge(int age) throws InvalidAgeException{
		if(age<18 || age>112) {
			throw new InvalidAgeException("Please provide valid age of voting!!!");
		}
	}

}
