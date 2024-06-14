package com.streamapi2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Find the average rank in all departments
public class Q12DepartmentByAverageRank {
	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		List<Student> list = studentList.list();
		System.out.println("average rank in all departments is:");
		Map<String, Double> map = list.stream().collect(
				Collectors.groupingBy((s) -> s.getDepartmantName(), Collectors.averagingInt(Student::getRank)));
		System.out.println(map);
	}
}
