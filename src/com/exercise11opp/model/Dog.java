package com.exercise11opp.model;

public class Dog {
	// 'public' accesible for all the universe
	// 'private' accesible solo en su clase
	// 'protected' accesible en la clase y sus subclases
	public int id;
	private String name;
	protected String breed;
	public int age;
	public double height;
	
	// Metodo constructor has the same name as the class
	public Dog(){ }
	
	public Dog(int id, String name, String breed, int age, double height) {
		// because 'id = id' is calling the with the same ident
		this.id = id;
		this.age = age;
		this.breed = breed;
		this.height = height;
		this.name = name;
	}
}
