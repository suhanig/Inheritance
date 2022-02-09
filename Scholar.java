public class Scholar extends Person {
	private String major;
	
	
		public Scholar (String name, int yearOfBirth, String major) {
			super(name, yearOfBirth);
			this.major = major;
		
		
		} //closes public scholar
		
		public String toString () {
		
			return (super.toString () + major);
		
		} //closes public String toString
} //closes public class Scholar
