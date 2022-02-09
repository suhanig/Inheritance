public class Person {
	
	//declaring variables
	private String name;
	private int yearOfBirth;
	
	public Person (String name, int yearOfBirth) {
		
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		
	}
	
	
	//cannot print an object. need a string toString method
	
	public String toString () {
		return ("The name of the scholar is " + name + ". The birth year of the scholar is " + yearOfBirth);
		
	} //closes string tostring


} //closes public class Person
