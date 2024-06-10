package oops;

public class School {
	private String name;
	String principal;
	Student s;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	
	public void displaySchool()
	{
		System.out.println(name);
		System.out.println(principal);
	}
	
	public void admitStudent(String name,int id)
	{
		s=new Student(name,id);
	}
	public School(String name, String principal) {
		super();
		this.name = name;
		this.principal = principal;
	}
}
