package com.revature;

import com.revature.model.Person;

public class Application {

	public static void main(String[] args) {
		Person p = new Person("John", 26, "512-100-2000");

		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getPhoneNumber());
		
		p.setName("Michael O'leary");
		p.setAge(30);
		p.setPhoneNumber("512-534-1234");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getPhoneNumber());
	}
	
}
