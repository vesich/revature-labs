package com.veselin.test;

import com.veselin.Person;

public class TestPerson extends Person {
	public static void main(String[] args) {
		TestPerson adam = new TestPerson();
		adam.setName("Gogo");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		System.out.println("You set the name of: " + name.toUpperCase());
		
	}
}
