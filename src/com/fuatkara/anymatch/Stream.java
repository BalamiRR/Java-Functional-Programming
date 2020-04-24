package com.fuatkara.anymatch;

import java.util.List;

import com.fuatkara.filter.Gender;
import com.fuatkara.filter.Person;

public class Stream {

	public static void main(String args[]) {
		List<Person> people = getPeople();
	

		boolean anyMatches = people.stream()
							.anyMatch(person -> person.getAge() < 58); //true  
							//58 den kucuk veya 58'den >58 var ise dogrudur true
 							//.allMatch(person -> person.getAge() < 8); false
		System.out.println(anyMatches);
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
