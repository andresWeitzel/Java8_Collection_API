package api.collection.interf.list.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListasOrdenamInteger {
	
	public static void main(String[] args) {
		
	//Como hemo visto, los collectors son complicados de manejar, usaremos solo las interfaces
				// ---------------------------------------------------------------------------
				// ---------------------------------------------------------------------------
				// ---------------------------------------------------------------------------

				System.out.println("\n======== ORDENAMIENTOS NUMEROS ==============");
				List<Integer> listaNumeros = Arrays.asList(22, 1, 3223, 12313, 3, 656, 5, 44, 2);
				// ---------------------------------------------------------------------------
				
				System.out.println("\n======== INTERFAZ COMPARABLE ==============");

				
				
				System.out.println("\n -- Recorrido Elementos de la lista --");
				listaNumeros.forEach(System.out::println);
				// ---------------------------------------------------------------------------
				System.out.println("\n -- Implementación Interfaz Comparable para  Ordenamientos  --");

				System.out.println("\n--Orden Natural Creciente--");
				// Orden Natural (Numericamente)
				Collections.sort(listaNumeros);

				listaNumeros.forEach(System.out::println);
				
				
				System.out.println("\n--Orden Natural Decreciente --");
			
				Collections.reverse(listaNumeros);

				listaNumeros.forEach(System.out::println);
				
				// ---------------------------------------------------------------------------
				System.out.println("\n -- Implementación Interfaz Comparable para  Ordenamientos con Stream --");
				
				
				System.out.println("\n--Orden Natural Creciente--");
				//El Javadoc no especifica si el sorted vacio implementa cual interfaz 
				listaNumeros.stream().sorted().forEach(System.out::println);
				
		
				
				
				System.out.println("\n--Orden Natural Decreciente--");
				listaNumeros.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
				
				
				// ---------------------------------------------------------------------------
				// ---------------------------------------------------------------------------
				// ---------------------------------------------------------------------------
				

				System.out.println("\n======== INTERFAZ COMPARATOR==============");

				
				// ---------------------------------------------------------------------------
				System.out.println("\n -- Implementación Interfaz Comparator para Ordenamientos --");

				System.out.println("\n--Orden Natural Creciente--");
				// Orden Natural (Numericamente)
				listaNumeros.sort(Comparator.naturalOrder());
				

				listaNumeros.forEach(System.out::println);

				System.out.println("\n--Orden Natural Decreciente --");
				
				listaNumeros.sort(Comparator.reverseOrder());

				listaNumeros.forEach(System.out::println);
				
				// ---------------------------------------------------------------------------
				System.out.println("\n -- Implementación Interfaz Comparator para el Ordenamiento con una E.D Stream() --");

				System.out.println("\n--Orden Natural Creciente Explicito--");
				// Orden Natural explicitamente (Numericamente)
				listaNumeros.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
				
				System.out.println("\n--Orden Natural Creciente Implicito--");
				//Orden Natural Implicito
				listaNumeros.stream().sorted().forEach(System.out::println);
				
				System.out.println("\n--Orden Natural Decreciente --");
				// Orden Natural explicitamente (Numericamente)
				listaNumeros.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
				
				
				// ---------------------------------------------------------------------------
				// ---------------------------------------------------------------------------
				// ---------------------------------------------------------------------------
				
	}
}
