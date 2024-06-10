package arrayPrograms;

import java.util.Scanner;

public class SearchingElementsFromObjectInArray {
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
			String name=sc.nextLine();
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter percentage");
			double per=sc.nextDouble();
			student[i]=new Student(name,id,per);
		}
		// read an element to be searched
		System.out.println("Enter the element to be searched");
		sc.nextLine();
		String key = sc.nextLine();
		//creating a flag variable
		boolean flag=false;
		//search element in the array
		for(int i=0;i<student.length;i++) {
			if(key.equals(student[i].name)) {
				flag=true;
				System.out.println(key+" is found");
				break;
			}
		}
		if(flag==false) {
			System.out.println(key+" is not found");
		}
	}
}
//
//class Student
//{
//	int id;
//	String name;
//	double per;
//	
//	Student(String name,int id,double per){
//		this.name=name;
//		this.id=id;
//		this.per=per;
//	}
//}
