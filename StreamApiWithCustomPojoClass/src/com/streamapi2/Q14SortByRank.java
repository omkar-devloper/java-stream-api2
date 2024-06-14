package com.streamapi2;

import java.util.Comparator;
import java.util.List;

//Find the list of students and sort them by their rank
public class Q14SortByRank {
	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		List<Student> list = studentList.list();
		System.out.println("Students By Rank Are:");
		list.stream().sorted(Comparator.comparingInt(Student::getRank)).forEach(System.out::println);

	}
}
