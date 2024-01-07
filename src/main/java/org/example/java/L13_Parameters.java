package org.example.java;

public class L13_Parameters {

	public static void main(String[] args) {
		getName("Smith", "John");
	}

	public static void getName(String firstName, String lastName) {
		System.out.println("Hello my name is " + firstName + " " + lastName);
	}

}
