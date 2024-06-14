package com.streamapi2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Group The Student By Department Names
public class Q2StudentByDepartment {

	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		List<Student> list = studentList.list();
		System.out.println("Student Group By Department Are:");
		Map<String, List<Student>> map = list.stream().collect(Collectors.groupingBy((s) -> s.getDepartmantName()));
		System.out.println(map);
	}

}
