package api.collection.interf.list.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListasEnlazadasDoblesCrud {
	
	public static void main(String[] args) {
		
		// Las listas enlazadas dobles las podemos recorrer
				// desde el ultimo nodo/elemento hasta el primero y viceversa

				// La gran mayoria de los metodos de ArrayList se implementan en LinkedList

				/*
				 * Los metodos principales especificos de esta clase
				 * son(https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html):
				 * 
				 * add(E e) Anexa el elemento especificado al final de esta lista. void add(int
				 * index, E element) Inserta el elemento especificado en la posición
				 * especificada de esta lista. peek() Recupera, pero no quita, la cabeza (primer
				 * elemento) de esta lista.
			
				 * get(int index) Devuelve el elemento en la posición especificada en esta
				 * lista.
				 * 
				 * set(int index, E element) Reemplaza el elemento en la posición especificada
				 * en esta lista por el elemento especificado.
				 * 
				 * etc....
				 */

				// TIP : ACOSTUMBRARSE A LEER DOCUMENTACIÓN OFICIAL(APROVECHAR LA TRADUCCION
				// AUTOMÁTICA)

				// ------------------------------------------------------------------

				List<String> listaEmpleados = new LinkedList<>(Arrays.asList("Juan Castro", "Marcelo Gutierrez",
						"Alvaro Franquez", "Sofia Alvarado", "Micaela Manzet"));

				System.out.println("\n===========Lista Empleados=================");
				listaEmpleados.stream().forEach(System.out::println);

				System.out.println("\n===========Lista Empleados Segun Apellido=================");
				listaEmpleados
				.stream()
				.filter(objeto->objeto.contains("Alvarado"))
				.forEach(System.out::println);

				//------------------- UPDATE ----------------------------
		/*
				System.out.println("\n===========Actualización de Empleados Segun Apellido=================");
				listaEmpleados
				.stream()
				.filter(objeto->objeto.contains("Alvarado"))
				.map(objeto->listaEmpleados.)
				.forEach(System.out::println);
				*/
				
				//------------------- ADD ----------------------------
				
				System.out.println("\n===========Agregamos Empleados=================");

				listaEmpleados.add("Gaston Lopez");
				listaEmpleados.add(0,"Jazmin Alarcon");
				
				System.out.println("\n===========Lista Empleados=================");
				listaEmpleados.stream().forEach(System.out::println);
				
	}

}
