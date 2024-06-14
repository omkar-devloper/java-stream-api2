package com.streamapi2;

import java.util.Comparator;
import java.util.List;

//Find the Students who stays in Delhi and sort them by their names
public class Q11FindByCity {
	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		List<Student> list = studentList.list();
		System.out.println("Students Stays In Delhi Are:");
		list.stream().filter((student) -> student.getCity().equalsIgnoreCase("delhi"))
				.sorted(Comparator.comparing(Student::getFirstName)).forEach(System.out::println);

	}
}
