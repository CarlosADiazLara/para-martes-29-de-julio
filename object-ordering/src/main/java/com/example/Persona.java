package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Persona {

	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Genero genero;
	private LocalDate fechaNacimiento;
	private double estatura;

// Metodo estatico que devuelve una lista de Persona
	public static List<Persona> getPersonas() {

		List<Persona> personas = new ArrayList<Persona>();

		Persona persona1 = Persona.builder().nombre("Belepo")
				.primerApellido("Biriba")
				.segundoApellido("Bokesa")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1977, Month.JUNE, 24))
				.estatura(1.80)
				.build();

		Persona persona2 = Persona.builder()
				.nombre("Carlos Alberto")
				.primerApellido("Diaz")
				.segundoApellido("Lara")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1991, Month.MAY, 7))
				.estatura(1.75)
				.build();

		Persona persona3 = Persona.builder()
				.nombre("Juan Simon")
				.primerApellido("Giraldo")
				.segundoApellido("Vargas")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1997, Month.MAY, 23))
				.estatura(1.82)
				.build();

		Persona persona4 = Persona.builder()
				.nombre("Maria Angeles")
				.primerApellido("Ciubanu")
				.genero(Genero.MUJER)
				.fechaNacimiento(LocalDate.of(1995, Month.JANUARY, 24))
				.estatura(1.70)
				.build();

		Persona persona5 = Persona.builder()
				.nombre("Nadia")
				.primerApellido("Lourido")
				.segundoApellido("Romero")
				.genero(Genero.MUJER)
				.fechaNacimiento(LocalDate.of(1977, Month.SEPTEMBER, 10))
				.estatura(1.75)
				.build();

		Persona persona6 = Persona.builder()
				.nombre("Eva")
				.primerApellido("Miro")
				.segundoApellido("Leveque")
				.genero(Genero.MUJER)
				.fechaNacimiento(LocalDate.of(1980, Month.OCTOBER, 14))
				.estatura(1.70)
				.build();

		Persona persona7 = Persona.builder()
				.nombre("Tatiana Aylin")
				.primerApellido("Ramos")
				.segundoApellido("Rodriguez")
				.genero(Genero.MUJER)
				.fechaNacimiento(LocalDate.of(2005, Month.FEBRUARY, 8))
				.estatura(1.65)
				.build();

		Persona persona8 = Persona.builder()
				.nombre("Mariana")
				.primerApellido("Ruiz")
				.segundoApellido("Giraldo")
				.genero(Genero.MUJER)
				.fechaNacimiento(LocalDate.of(2000, Month.JUNE, 28))
				.estatura(1.68)
				.build();

		Persona persona9 = Persona.builder()
				.nombre("Ramon Eduardo")
				.primerApellido("Hernandez")
				.segundoApellido("Castillo")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1990, Month.FEBRUARY, 23))
				.estatura(1.80)
				.build();
		
		Persona persona10 = Persona.builder()
				.nombre("Mauricio")
				.primerApellido("Mendez")
				.segundoApellido("Da Corte")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1993, Month.FEBRUARY, 3))
				.estatura(1.80)
				.build();
		
		personas = Arrays.asList(persona1, persona2, persona3, persona4, 
								persona5, persona6, persona7, persona8, 
								persona9, persona10);

		//Otra forma de agregar persona a la lista de personas
//		personas.add(persona1);
//		personas.add(persona2);
		
		
		
		return personas;
	}
}
