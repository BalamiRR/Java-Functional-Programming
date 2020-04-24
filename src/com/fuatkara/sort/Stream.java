package com.fuatkara.sort;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.fuatkara.filter.Gender;
import com.fuatkara.filter.Person;

public class Stream {

	public static void main(String args[]) {
		List<Person> people = getPeople();
	
		List<Person> sorted = people.stream()
				.sorted(Comparator.comparing(Person::getAge))
				.collect(Collectors.toList());
			sorted.forEach(System.out::println);
		
//		List<Person> sorted = people.stream()
//			.sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed())
//			.collect(Collectors.toList());
//		sorted.forEach(System.out::println);
	
//		List<Person> sorted = people.stream()
//				.sorted(Comparator.comparing(Person::getAge).reversed())    ==>> ters siralicak
//				.collect(Collectors.toList());
//			sorted.forEach(System.out::println);
	}

	private static List<Person> getPeople() {
		return List.of(
			new Person("Jack Black", 32, Gender.MALE),
			new Person("Anna Blue", 37, Gender.FEMALE),
			new Person("Mr. Jones", 12, Gender.MALE),
			new Person("Amiele Brown", 78, Gender.FEMALE),
			new Person("Ania Red", 29, Gender.FEMALE),
			new Person("Thomas Neo", 51, Gender.MALE),
			new Person("Emie Pink", 73, Gender.FEMALE)
		);
	}

}
