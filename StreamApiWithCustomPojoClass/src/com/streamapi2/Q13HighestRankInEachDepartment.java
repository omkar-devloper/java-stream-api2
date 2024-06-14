package com.streamapi2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

// Find the highest rank in each department
public class Q13HighestRankInEachDepartment {
	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		List<Student> list = studentList.list();
		System.out.println("highest rank in each department is:");
		Map<Object, Optional<Student>> map = list.stream()
				.collect(Collectors.groupingBy((s) -> s.getDepartmantName(), Collectors.minBy(Comparator.comparing(Student::getRank))));
		System.out.println(map);
	}
}
