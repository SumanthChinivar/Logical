package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortingUsingName {
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
		System.out.println("Array before sorting:");
		for (int i = 0; i < student.length; i++) {
			System.out.print(student[i]+" ");
		}
		//sort the array
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(student[j].name.compareTo(student[j+1].name)>0) {
					Student temp=student[j];
					student[j]=student[j+1];
					student[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Array after sorting");
		for (int i = 0; i < student.length; i++) {
			System.out.print(student[i]+" ");
		}
	}
}

class Student{
	int id;
	String name;
	double per;

	Student(String name, int id, double per) {
		this.name = name;
		this.id = id;
		this.per = per;
	}

	public String toString() {
		return "[Name:" + name + ", ID:" + id + ", Per:" + per + "]";
	}
}
