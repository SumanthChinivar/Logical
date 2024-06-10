package arrayPrograms;

import java.util.Arrays;

public class SortingEmployeeUsingID {
	public static void main(String[] args) {
		Employee[] e= {new Employee("Navya",100),new Employee("Bavya",20)};
		System.out.println(Arrays.toString(e));
		Arrays.sort(e);
		System.out.println(Arrays.toString(e));
	}
}

class Employee implements Comparable
{
	String name;
	int id;
	
	public Employee(String name,int id) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}

	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		return this.name.compareTo(e.name);
	}
	
	public String toString()
	{
		return "Name:"+name+",ID:"+id;
	}
	
}