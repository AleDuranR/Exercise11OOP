package com.exercise11opp.app;

// Import the class Perro with his package.'nombreClase'
import com.exercise11opp.model.Dog;

public class PerroApp {

	public static void main(String[] args) {
		// Instansear una clase 'Perro'
		// 1st Way 
		Dog pluto;
		// Calling the constructor method
		pluto = new Dog();
		
		// 2nd Way
		Dog tribillin = new Dog();
		
		// Acceder a los miembros de la clase Perrp
		// Name is available because is private
		// Age
		pluto.age = 15;
		pluto.height = .50;
		pluto.id = 10;
		
		System.out.format("Pluto's age is %d \n", pluto.age);
		System.out.format("Pluto's heiight is %2f \n", pluto.height);
		System.out.format("Pluto's ID is %d \n", pluto.id);
		
		// Object creation
		Dog firulais =  new Dog(1, "Firulais", "Labrador",5,60.0);
		
		System.out.println("Fiulais age " + firulais.age );
		System.out.println("Fiulais height " + firulais.height);
		System.out.println("Fiulais id " + firulais.id);
		
	}
	

}
