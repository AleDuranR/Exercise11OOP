package com.exercise11opp.app;

// Importar la clase Perro mediante su paquete.'nombreClase'
import com.exercise11opp.model.Perro;

public class PerroApp {

	public static void main(String[] args) {
		// Instansear una clase 'Perro'
		// 1st Way 
		Perro pluto;
		pluto = new Perro();
		
		// 2nd Way
		Perro tribillin = new Perro();
		
		// Acceder a los miembros de la clase Perrp
		// Name is available because is private
		// Age
		pluto.age = 15;
		pluto.height = .50;
		pluto.id = 10;
		
		System.out.format(" Pluto's age is %d", pluto.age);
		System.out.format("Pluto's heiight is %2f", pluto.height);
		System.out.format("Pluto's ID is %d", pluto.id);
	}

}
