package com.streamapi2;

import java.util.Comparator;
import java.util.List;

//Find the student who has second rank
public class Q15FindSecondHighestRank {
	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		List<Student> list = studentList.list();
		Student student = list.stream().sorted(Comparator.comparingInt(Student::getRank)).skip(1).findFirst().get();
		System.out.println("2nd Highest Student Is:");
		System.out.println(student);

	}
}
