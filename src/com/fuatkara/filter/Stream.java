package com.fuatkara.filter;

import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String args[]) {
		List<Person> people = getPeople();
		
		List<Person> females = people.stream()
			.filter(person -> person.getGender().equals(Gender.FEMALE))
			.collect(Collectors.toList());
		females.forEach(System.out::println);
		
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
