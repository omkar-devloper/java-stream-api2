package com.streamapi2;

import java.util.List;

//count no of students
public class Q3StudentCount {
	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		List<Student> list = studentList.list();
		long count = list.stream().count();
		System.out.println("No Of Student Are:" + count);

	}

}
