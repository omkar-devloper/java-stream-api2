package com.streamapi2;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//find student max age
public class Q4StudentMaxAge {

	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		List<Student> list = studentList.list();
		Optional<Student> count = list.stream().max(Comparator.comparingInt(Student::getAge));
		System.out.println("Students Max Age Is" + count.get());

	}

}
