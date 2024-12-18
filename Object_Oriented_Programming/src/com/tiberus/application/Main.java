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

/**
 * For a more detailed information about object-oriented programming in Java go to:
 *  
 * https://www.amazon.com/dp/B0DG45KX7D?ref_=pe_93986420_774957520
 */