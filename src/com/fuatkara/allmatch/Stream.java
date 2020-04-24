package com.fuatkara.allmatch;

import java.util.List;
import com.fuatkara.filter.Gender;
import com.fuatkara.filter.Person;

public class Stream {

	public static void main(String args[]) {
		List<Person> people = getPeople();
	
		boolean allMatches = people.stream()
				.allMatch(person -> person.getAge() > 8); //true
				//.allMatch(person -> person.getAge() < 8); false
		System.out.println(allMatches);
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
