package com.tiberus.model;

public class Person {
	/** person identification */
	String name;

	/**
	 * The Person constructor is like a tool for making person objects in a factory
	 * called the Person class
	 */
	public Person(String name) {
		this.name = name;
	}

	/* method to get name of object created */
	public String getName() {
		return name;
	}

}
