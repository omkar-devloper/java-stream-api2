package com.streamapi2;

import java.util.List;

//Find list of students whose first name starts with alphabet A
public class Q1FindStudents {
	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		List<Student> list = studentList.list();
		System.out.println("Students Whose Name Starting With A Are:");
		list.stream()
				.filter((student) -> student.getFirstName().startsWith("a") || student.getFirstName().startsWith("A"))
				.forEach(System.out::println);

	}
}
