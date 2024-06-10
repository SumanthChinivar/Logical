package arrayPrograms;

import java.util.Arrays;

public class SortingEmployee {
	public static void main(String[] args) {
		Employee[] e= {new Employee("Navya",10),new Employee("Bavya",20)};
		Arrays.sort(e);
	}
}

/*
 * class Employee { String name; int id;
 * 
 * public Employee(String name,int id) { // TODO Auto-generated constructor stub
 * this.id=id; this.name=name; } }
 */