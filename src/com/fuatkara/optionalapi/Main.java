package com.fuatkara.optionalapi;

import java.util.Optional;

public class Main {
	
	public static void main(String args[]) {
		
//		Person person = new Person("Fuat","aaa@gmail.com");  //Seklinde calisir fakat, null yaptigimizda hata aliriz
//		System.out.println(person.getEmail().toLowerCase());//oyuzden getEmailimiz Optional<> olur

		Person person = new Person("Fuat",null);    //null yerine "hames@gmail.com" yaz

		String email =person.getEmail()
				.map(String::toLowerCase)
				.orElse("email is not provided");
		System.out.println(email);
		
		//veya asagidaki gibide yapabilirdik.
//		if(person.getEmail().isPresent()) {
//			String email = person.getEmail().get();
//			System.out.println(email.toLowerCase());
//		}
//		else {
//			System.out.println("not provided");
//		}
	}
}

class Person{
	private String name;
	private String email;
	
	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public String getEmail() {
//		return email;
//	}

	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}