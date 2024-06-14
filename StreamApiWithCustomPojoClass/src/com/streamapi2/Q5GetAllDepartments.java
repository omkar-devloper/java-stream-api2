package com.streamapi2;

import java.util.List;
//get all departments
public class Q5GetAllDepartments {
	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		List<Student> list = studentList.list();
		System.out.println("All Departments Are:");
		list.stream().map((s) -> s.getDepartmantName()).distinct().forEach(System.out::println);

	}
}
