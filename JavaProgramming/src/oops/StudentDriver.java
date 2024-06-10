package oops;

public class StudentDriver {
	public static void main(String[] args) {
		School s=new School("VidyaMandira","Ramesh");
		s.admitStudent("Suresh", 10);
		s.displaySchool();
		s.s.displayStudent();
		System.out.println(s.s.getName());
		s.setPrincipal("Suraj");
		System.out.println(s.getPrincipal());
		s.s.setName("Dharmesh");
		System.out.println(s.s.getName());
		
		System.out.println("=======");
		ScienceStudent s1=new ScienceStudent("Girish", 14, "AIPhotoshop", 3.5);
		s1.displayScienceStudent();
				
	}
}
