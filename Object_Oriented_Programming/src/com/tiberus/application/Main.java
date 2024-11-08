package com.tiberus.application;

import com.tiberus.model.Person;

public class Main {
	
    
	public static void main(String[] args) {
		/**create a Person object called Donald Trump, by calling the Person constructor using new keyword*/
		Person donald = new Person("Donald Trump");
		
		/** get name of object just created*/
		System.out.println(donald.getName());
	}

}
