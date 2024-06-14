package com.streamapi2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Count The Students By Department Names
public class Q6CountStudentByDepartment {

	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		List<Student> list = studentList.list();
		System.out.println("Student Count By Department Are:");
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy((s) -> s.getDepartmantName(), Collectors.counting()));
		System.out.println(map);
	}

}
