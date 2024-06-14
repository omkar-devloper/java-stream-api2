package com.streamapi2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Find the average age of male and female students
public class Q9FindAverageAgeOfMaleFemaleStudent {
	public static void main(String[] args) {
		StudentList studentList = new StudentList();
		List<Student> list = studentList.list();
		System.out.println("Average age of male and female students is:");
		Map<String, Double> map = list.stream()
				.collect(Collectors.groupingBy((s) -> s.getGender(), Collectors.averagingInt(Student::getAge)));
		System.out.println(map);
	}

}
