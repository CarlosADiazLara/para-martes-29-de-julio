package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
	public static void main(String[] args) {

		List<String> nombres = Arrays.asList("Carlos", "Mauricio", "Belepo");

		// Listado de nombres sin ordenar
		System.out.println("Nombres sin ordenar");
		System.out.println(nombres);
		
		System.out.println("Nombres ordenados alfabeticamente");
		
		Collections.sort(nombres);
		
		System.out.println(nombres);
		
		List<Integer> numeros = Arrays.asList(100, 200, 10, 40, 25);
		
		System.out.println("Lista de numeros ordenada");
		
		Collections.sort(numeros);
		
		System.out.println(numeros);
		
		/*
		 * Quiero recuperar una lista de personas para ordenarla
		 * 
		 * */
		
		List<Persona> personas = Persona.getPersonas();
		
		// Quiero ordenar la lista de personas
		// ¿Por que no es posible ahora?
		// Rta. Porque todos los tipos de datos implicito de Java implementan una interface
		// que se llama Comparable(T), que tiene un metodo abstracto que se llama compareTo
		// que utilizara el metodo sort como criterio de comparacion
		// Y nuestra clase persona no implementa todavia dicha interfaz
		
		Collections.sort(personas);
		
		System.out.println("Listado de Persona ordenado según el orden Natural de la clase Persona");
		System.out.println(personas);
		
	}
}
