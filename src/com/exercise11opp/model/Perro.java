package com.exercise11opp.model;

public class Perro {
	// 'public' accesible en todo el universo
	// 'private' accesible solo en su clase
	// 'protected' accesible en la clase y sus subclases
	public int id;
	private String name;
	protected String breed;
	public int age;
	public double height;
	
	// Metodo constructor
	public Perro(){ }
	
	public Perro(int id, String name, String breed, int age, double height) {
		
	}
}
