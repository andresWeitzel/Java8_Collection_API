package api.collection.interf.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListasEnlazadasSimplesOtrosMetodos {
	

	public static void main(String[] args) {

		List<String> listaProductos = 
				new ArrayList<>(Arrays.asList("Celular", "Notebook", "Parlante"));

		//------------------------------------------------------
		// === Lista De Elementos =====

		System.out.println("\n=== Lista de Elementos =====");
		listaProductos.stream().forEach(System.out::println);

		//------------------------------------------------------
		// === Comprobacion Lista Vacia =====

		System.out.println("\n=== Comprobacion Lista Vacia =====");
		boolean comprLista = listaProductos.isEmpty();

		String estadoLista = (comprLista) ? "Lista Vacía" : "Lista Con Elementos";

		System.out.println(estadoLista);

		//------------------------------------------------------
		// === Comprobacion de Elementos =====
		System.out.println("\n=== Comprobacion de Elementos =====");

		String elemento = "Auricular";

		boolean comprElemento = listaProductos.contains(elemento);

		String estadoElemento = (comprElemento) ? "Existe el Elemento " + elemento + " en la Lista"
				: "No Existe el Elemento " + elemento + " en la Lista";

		System.out.println(estadoElemento);

		//------------------------------------------------------
		// === Eliminación de todos los Elementos de la Lista =====
		System.out.println("\n=== Eliminación de todos los Elementos de la Lista =====");

		listaProductos.clear();

		//------------------------------------------------------
		// === Lista De Elementos =====
		System.out.println("\n=== Lista de Elementos =====");
		listaProductos.stream().forEach(System.out::println);
		
		//------------------------------------------------------
		
		//Existen los mismos metodos vistos para realizar las operaciones con varios elementos
		//al mismo tiempo, investigar al respecto, este fue un resumen sucinto
	}

}
