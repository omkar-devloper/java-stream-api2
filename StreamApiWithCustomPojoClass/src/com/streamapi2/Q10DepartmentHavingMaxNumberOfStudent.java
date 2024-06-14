package com.streamapi2;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

// Find the department who is having maximum number of students
public class Q10DepartmentHavingMaxNumberOfStudent {
	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		List<Student> list = studentList.list();
		System.out.println("Student Max By Department Is:");
		Entry<String, Long> map = list.stream()
				.collect(Collectors.groupingBy((s) -> s.getDepartmantName(), Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).get();
		System.out.println(map);
	}
}
