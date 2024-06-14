package com.streamapi2;

import java.util.List;

//Find the list of students whose age is less than 30
public class Q7FindStudentByAge {
	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		List<Student> list = studentList.list();
		System.out.println("Students Whose Age Less Than 30 Are:");
		list.stream()
				.filter((student) -> student.getAge()<30)
				.forEach(System.out::println);

	}

}
