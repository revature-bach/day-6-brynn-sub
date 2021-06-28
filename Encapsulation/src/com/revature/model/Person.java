package com.revature.model;

public class Person {

	private String name;
	private int age;
	private String phoneNumber;
	
	public Person(String name, int age, String phoneNumber) {
//		this.name = name;
//		this.age = age;
//		this.phoneNumber = phoneNumber;
		setName(name);
		setAge(age);
		setPhoneNumber(phoneNumber);
	}
	
	/*
	 * Getter methods
	 */
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/*
	 * Setter methods
	 */
	public void setName(String name) {
		// Check if name contains only alphabetical characters, apostrophes
		// or spaces
		// We will utilize what is known as a regular expression (regex)
		// to do this
		// The String class has various instance methods that will take in a regular
		// expression as an argument
		// for example, the .matches(...) method
		if (name.matches("[a-zA-Z\\s']+")) {
			this.name = name;
		} else {
			System.out.println("Invalid name " + name + " was trying to be set");
		}
	}
	
	public void setAge(int age) {
		if (age < 0) {
			System.out.println("Invalid value " + age + " for setting age");
		} else {
			this.age = age;
		}
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}")) {
			this.phoneNumber = phoneNumber;
		} else {
			System.out.println("Invalid phone number " + phoneNumber 
					+ ". Format must be xxx-xxx-xxxx");
		}
	}
}
