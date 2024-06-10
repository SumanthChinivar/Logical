package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortUsingID {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// reading the size of the array
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		// creating an array
		Student[] student = new Student[size];
		// reading the elements of the array
		for (int i = 0; i < student.length; i++) {
			System.out.println("Enter student name");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter percentage");
			double per = sc.nextDouble();
			student[i] = new Student(name, id, per);
		}
		Arrays.sort(student);
		System.out.println(Arrays.toString(student));
	}
}

/*
 * class Student implements Comparable { int id; String name; double per;
 * 
 * Student(String name, int id, double per) { this.name = name; this.id = id;
 * this.per = per; }
 * 
 * public String toString() { return "[Name:" + name + ", ID:" + id + ", Per:" +
 * per + "]"; }
 * 
 * @Override public int compareTo(Object o) { Student s = (Student) o; return
 * this.name.compareTo(s.name); }
 * 
 * }
 */