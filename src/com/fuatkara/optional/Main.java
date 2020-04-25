package com.fuatkara.optional;

import java.util.Optional;

public class Main {
	
	public static void main(String args[]) {
	
		
//================
//		Optional<String> hello = Optional.ofNullable("hello");   //null yaparsan cikti world olur
//		
//		System.out.println(hello.isPresent());
//		System.out.println(hello.isEmpty()); 	
		
//		hello.ifPresentOrElse(word -> {
//			System.out.println(word);
//		}, () -> {
//			System.out.println("world");
//		});
		
//		//hello.ifPresentOrElse(System.out::println,()-> System.out.println("world"));
		
//=================		
//		Optional<String> hello = Optional.ofNullable("Fuat");
//		  
//		System.out.println(hello.isPresent());                   //Output -> isPresent=false, isEmpty=false, Fuat
//		System.out.println(hello.isEmpty()); 	
//		
//		hello.ifPresent(word -> {
//			System.out.println(word);               //asagidaki gibi de yazabilirdik.
//		});
		
//		//hello.ifPresent(System.out::println);     //yukardaki gibi de yazabilirdik.
		

//=================
//		Optional<String> hello = Optional.ofNullable(null);
//		     
//		System.out.println(hello.isPresent());                   //Output -> isPresent=false, isEmpty=true
//		System.out.println(hello.isEmpty()); 	
//		
//		hello.ifPresent(word -> {
//			System.out.println(word);
//		});
		
//=================			
//		Optional<String> hello = Optional.ofNullable(null);
//		
//		System.out.println(hello.isPresent());
//		System.out.println(hello.isEmpty()); 	
//		
//		String orElse = hello
//				.map(String::toUpperCase)
//				.orElseGet(() -> {
//					return "word";
//				});	
//		System.out.println(orElse);

//=================		
//		Optional<String> hello = Optional.ofNullable("hello");
//		
//		System.out.println(hello.isPresent());
//		System.out.println(hello.isEmpty()); 	
//		
//		String orElse = hello
//				.map(String::toUpperCase)
//				.orElse("world");	
//		System.out.println(orElse);

//=================			
//		Optional<String> hello = Optional.ofNullable(null);
//		
//		System.out.println(hello.isPresent());             //=>Output: world
//		System.out.println(hello.isEmpty()); 	
//		
//		String orElse = hello.orElse("world");	
//		System.out.println(orElse);
		
//=================	
//		Optional<String> hello = Optional.empty();
//		
//		System.out.println(hello.isPresent());     		//=>Output : world
//		System.out.println(hello.isEmpty()); 	
//		
//		String orElse = hello.orElse("world");	
//		System.out.println(orElse);		
		
//=================			
//		Optional<String> hello = Optional.of("hello");
//		
//		System.out.println(hello.isPresent());
//		System.out.println(hello.isEmpty()); 	
//		
//		String orElse = hello.orElse("world");	         //=> Output : hello
//		System.out.println(orElse);
		
//=================	
//		Optional<String> empty = Optional.of("Hello"); 
//		
//		System.out.println(empty.isPresent());  		//-> True
//		System.out.println(empty.isEmpty());    		//-> False
//=================	
//		Optional<Object> empty = Optional.empty();    
//		
//		System.out.println(empty.isPresent());  		//->false
//		System.out.println(empty.isEmpty());    		//->true
	}
	
}