package com.fuatkara.refactor;

import java.util.ArrayList;
import java.util.List;

import com.fuatkara.filter.Gender;
import com.fuatkara.filter.Person;

public class Stream {

	public static void main(String args[]) {
		List<Person> people = getPeople();
		
		List<Person> females = new ArrayList<>();
		
		for(Person person : people) {
			if(person.getGender().equals(Gender.FEMALE)) {
				females.add(person);
			}
		}
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