package com.fuatkara.map;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fuatkara.filter.Gender;
import com.fuatkara.filter.Person;

public class Stream {

	public static void main(String args[]) {
		List<Person> people = getPeople();
	
		Map<Gender, List<Person>> groupByGender = people.stream()
				.collect(Collectors.groupingBy(Person::getGender));  //Bize  FEMALE ve MALE OLARAK AYRI AYRI SIRALAR
		
		groupByGender.forEach((gender, people1) -> {
			System.out.println(gender);                    //-> Bu kisim sadece bize alt alta siralamayi verir.
			people1.forEach(System.out::println);
			System.out.println();
		});	
	//=====================

//		Optional<String> oldestFemaleAge = people.stream()
//					.filter(person -> person.getGender().equals(Gender.FEMALE))      -->En yasli ksiiyi bulma
//					.max(Comparator.comparing(Person::getAge))
//					.map(Person::getName);
//		oldestFemaleAge.ifPresent(System.out::println);
		
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
