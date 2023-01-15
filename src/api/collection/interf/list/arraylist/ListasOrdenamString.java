package api.collection.interf.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListasOrdenamString {

	public static void main(String[] args) {

		/*
		 * Para Ordenamientos en Java8 existen (las mas empleadas) 2 interfaces y 1 clase.
		 * 
		 * -Comparable --> Ordenamiento Natural con objetos de la misma clase (metodo
		 * sort de Collection) 
		 * 
		 * -Comparator --> Ordenamiento Natural con objetos de
		 * clases diferentes
		 * 
		 * -Collectors --> Es una implementacion para acumular elementos en colecciones,
		 * resumir elementos con diversos criterios, etc
		 * 
		 * --Comparable-- Usando la Int. Comparable ordenamos un objeto en relacion al
		 * otro que se ingrese como parametro, el objeto debe estar preparado para ser
		 * ordenado (osea debe podedr implementar la interfaz Comparables)
		 * 
		 * -- Comparator -- Se crea una clase externa que ayuda al ordenamiento de los
		 * objetos sin modificar la estructura de de las clases existentes.
		 * 
		 */


		List<String> listaEmpleados = Arrays.asList("Javier Martinez 23 años", "Marcos Costa 22 años",
				"Julieta Perez 26 años", "Rafael Listberth 32 años");


		// ---------------------------------------------------------------------------
		
		System.out.println("\n======== INTERFAZ COMPARABLE ==============");

		
		
		System.out.println("\n -- Recorrido Elementos de la lista --");
		listaEmpleados.forEach(System.out::println);
		// ---------------------------------------------------------------------------
		System.out.println("\n -- Implementación Interfaz Comparable para  Ordenamientos  --");

		System.out.println("\n--Orden Natural Creciente--");
		// Orden Natural (Alfabeticamente)
		Collections.sort(listaEmpleados);

		listaEmpleados.forEach(System.out::println);
		
		
		System.out.println("\n--Orden Natural Decreciente --");
		
	
		Collections.reverse(listaEmpleados);

		listaEmpleados.forEach(System.out::println);
		
		// ---------------------------------------------------------------------------
		System.out.println("\n -- Implementación Interfaz Comparable para  Ordenamientos con Stream --");
		
		
		System.out.println("\n--Orden Natural Creciente--");
		//El Javadoc no especifica si el sorted vacio implementa cual interfaz 
		listaEmpleados.stream().sorted().forEach(System.out::println);
		
		//En este caso da error . Investigar como seria
		//listaEmpleados.stream().sorted(Collections.sort(listaEmpleados)).forEach(System.out::println);
		
		
		
		System.out.println("\n--Orden Natural Decreciente--");
		listaEmpleados.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		
		// ---------------------------------------------------------------------------
		// ---------------------------------------------------------------------------
		// ---------------------------------------------------------------------------
		

		System.out.println("\n======== INTERFAZ COMPARATOR==============");

		
		// ---------------------------------------------------------------------------
		System.out.println("\n -- Implementación Interfaz Comparator para Ordenamientos --");

		System.out.println("\n--Orden Natural Creciente--");
		// Orden Natural (Alfabeticamente)
		listaEmpleados.sort(Comparator.naturalOrder());
		

		listaEmpleados.forEach(System.out::println);

		System.out.println("\n--Orden Natural Decreciente --");
		
		listaEmpleados.sort(Comparator.reverseOrder());

		listaEmpleados.forEach(System.out::println);
		
		// ---------------------------------------------------------------------------
		System.out.println("\n -- Implementación Interfaz Comparator para el Ordenamiento con una E.D Stream() --");

		System.out.println("\n--Orden Natural Creciente Explicito--");
		// Orden Natural explicitamente (Alfabeticamente)
		listaEmpleados.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
		System.out.println("\n--Orden Natural Creciente Implicito--");
		//Orden Natural Implicito
		listaEmpleados.stream().sorted().forEach(System.out::println);
		
		System.out.println("\n--Orden Natural Decreciente --");
		// Orden Natural explicitamente (Alfabeticamente)
		listaEmpleados.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
		// ---------------------------------------------------------------------------
		// ---------------------------------------------------------------------------
		// ---------------------------------------------------------------------------
		

		System.out.println("\n======== CLASE COLLECTORS ==============");
		
		//https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html
		
		// ---------------------------------------------------------------------------
		System.out.println("\n -- Implementación Clase Collectors para Ordenamientos con Stream --");

		System.out.println("\n--Orden Natural Creciente--");
		// Orden Natural (Alfabeticamente)
		listaEmpleados.stream().collect(Collectors.toList()).forEach(System.out::println);
		
		
		System.out.println("\n--Orden Natural Decreciente--");
		// Orden Natural (Alfabeticamente)
		listaEmpleados
			.stream()
			.collect(Collectors.collectingAndThen(Collectors.toList(),
                strings -> {
                    Collections.reverse(strings);
                    return strings;
            }))
		.forEach(System.out::println);
		
		//Por eso es que para ordenamientos es preferible el uso de interfaces
		//a medida que el codigo va creciendo se va complejizando aún más

		
	}

}
