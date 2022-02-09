public class Instructor extends Person {
	private double salary;
	
	
		public Instructor (String name, int yearOfBirth,String major, double salary) {
		
			super(name, yearOfBirth);
			this.salary = salary;
		
		} //closes public Instructor
		
		public String toString () {
		
			return (super.toString() + salary);
		
		} //closes public String toString

} //closes public class Instructor
