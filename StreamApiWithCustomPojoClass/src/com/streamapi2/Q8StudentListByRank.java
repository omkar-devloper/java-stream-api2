package com.streamapi2;

import java.util.List;

//Find the list of students whose rank is in between 50 and 100
public class Q8StudentListByRank {
	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		List<Student> list = studentList.list();
		System.out.println("Students Whose rank is in between 50 and 100 Are:");
		list.stream().filter((student) -> student.getRank() >= 50 && student.getRank() <= 100)
				.forEach(System.out::println);

	}
}
