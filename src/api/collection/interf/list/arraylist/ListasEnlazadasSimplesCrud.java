package api.collection.interf.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class ListasEnlazadasSimplesCrud {

	public static void main(String[] args) {

		/*
		 * Existen 2 tipos de listas, ArrayList y LinkedList. La clase Vector y Stack
		 * estan en la misma interfaz List pero son pilas no listas, otro tipo de
		 * estructura de dato. Todas estas clases son E.D dinamicas, pueden cambiar los
		 * valores de sus elementos en tiempo de ejecucion
		 * 
		 * 
		 * Las listas nos serviran para almacenar datos que se pueden repetir y cuyo
		 * orden de insercion puede ser relevante. Los tipos de listas descritos
		 * proporcionan las mismas funcionalidades. Solo cambia la implementacion
		 * interna afectando levemente el rendimiento.
		 * 
		 * Listas simplemente enlazadas. Cada nodo (elemento) contiene un único enlace
		 * que lo conecta al nodo siguiente o nodo sucesor. La lista es eficiente en
		 * recorridos directos (“adelante”).
		 * 
		 */

		// Apunte Listas Enlazadas Simples
		// http://www.itnuevolaredo.edu.mx/takeyas/apuntes/estructura%20de%20datos/Apuntes/02-ListasSimples.pdf

		// Apuntes Api Collection
		// http://www.itnuevolaredo.edu.mx/takeyas/apuntes/estructura%20de%20datos/Apuntes/

		/*
		 * Los metodos principales especificos de esta clase
		 * son(https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html):
		 * 
		 * add(E e) Anexa el elemento especificado al final de esta lista.
		 * 
		 * add(int index, E element) Inserta el elemento especificado en la posición
		 * especificada de esta lista.
		 * 
		 * get(int index) Devuelve el elemento en la posición especificada en esta
		 * lista.
		 * 
		 * set(int index, E element) Reemplaza el elemento en la posición especificada
		 * en esta lista por el elemento especificado.
		 * 
		 * clear() Quita todos los elementos de esta lista.
		 * 
		 * clone() Devuelve una copia superficial de esta instancia de ArrayList.
		 * 
		 * contains(Object o) Devuelve true si esta lista contiene el elemento
		 * especificado.
		 * 
		 * indexOf(Object o) Devuelve el índice de la primera aparición del elemento
		 * especificado en esta lista, o -1 si esta lista no contiene el elemento.
		 *
		 * boolean isEmpty() Devuelve true si esta lista no contiene elementos.
		 * 
		 * remove(int index) Quita el elemento en la posición especificada en esta
		 * lista.
		 * 
		 * remove(Object o) Quita la primera aparición del elemento especificado de esta
		 * lista, si está presente.
		 * 
		 * etc..
		 * 
		 */

		// TIP : ACOSTUMBRARSE A LEER DOCUMENTACIÓN OFICIAL(APROVECHAR LA TRADUCCION
		// AUTOMÁTICA)

		// ------------------------------------------------------------------

		// ==DECLARACIÓN E INICIALIZACION DE LISTAS==

		// ------------------------------------------------------------------

		// ==ArrayList==

		// List<String> listaModelo = new ArrayList<String>();
		// List<String> listaModelo = new ArrayList();
		List<String> listaModelo = new ArrayList<>();

	
		// ------------------------------------------------------------------

		// ==LinkedList==

		List<String> listaModelo02 = new LinkedList<>();

		
		// ------------------------------------------------------------------

		// ==METODOS DE INSERCION EN LISTAS==

		// ------------------------------------------------------------------
		// Ya aclaramos que no varia considerablemente el tipo de clase implementada
		// LinkedList o ArrayList,vamos a usar ArrayList para resumir codigo.

		// Si insertamos un elemento a la lista se crea un nodo por elemento y
		// cambiamos la estructura de la coleccion

		// ---------------------ADD AND GET---------------------------------

		List<String> listaEmpleados = new ArrayList<>(
				Arrays.asList("Juan Perez", "Sofia Gutierrez", "Carlos Rodriguez"));

		String empleado04 = "";

		// Otra posibilidad de asignacion en listas, no es una buena practica
		listaEmpleados.add(empleado04 = "Martin Merch");
		// Asignamos el valor directamente
		listaEmpleados.add("Jimena Castro");

		System.out.println("\n===========Lista Empleados=================");

		// System.out.println(listaEmpleados.toString());
		System.out.println(listaEmpleados);

		System.out.println("\n===========Lista Empleados=================");

		// foreach recorrido completo de la lista
		/*
		 * for (String em : listaEmpleados) { System.out.println(em); }
		 */

		// Lambda Explicita
		// listaEmpleados.stream().forEach(obj->System.out.println());

		// foreach recorrido completo con lambda implicita
		listaEmpleados.stream().forEach(System.out::println);

		System.out.println("\n===========Elementos por posicion=================");

		// Obtener Elemento segun indice
		System.out.println(listaEmpleados.get(0));
		System.out.println(listaEmpleados.get(2));

		System.out.println("\n===========Elementos por posicion con lambdas=================");

		listaEmpleados.stream().filter(obj -> obj.equals(listaEmpleados.get(0))).forEach(System.out::println);

		listaEmpleados.stream().filter(obj -> obj.equals(listaEmpleados.get(2))).forEach(System.out::println);

		// -------------------REMOVE----------------------------------

		List<Double> listaPrecios = new ArrayList<>();

		double kiloManzanas = 400.90d;
		double kiloBananas = 300.77d;
		double kiloPeras = 222.57d;

		// El metodo add con adicción por indice no es buena practica
		// si no sabemos la cantida de elementos y sus indices, no podremos
		// insertar un elemento donde indice maximo no haya sido declarado
		// Ej:
		// listaPrecios.add(0, kiloManzanas);
		// listaPrecios.add(4, kiloBananas);
		// listaPrecios.add(2, kiloPeras);

		// Secuencialemente la adiccion de elementos es valido
		listaPrecios.add(0, kiloManzanas);
		listaPrecios.add(1, kiloBananas);
		listaPrecios.add(2, kiloPeras);

		System.out.println("\n===========Lista Frutas=================");
		// foreach recorrido completo con lambdas
		listaPrecios.stream().forEach(System.out::println);

		// Eliminamos un elemento de la lista segun su indice
		// Realizamos comprobaciones

		int longitud = listaPrecios.size();
		int indice = 0;
		double elemento = listaPrecios.get(indice) ;

		/*
		if (longitud > 0 && indice < longitud) {
			System.out.println("\n--Elemento " + elemento + " Eliminado de la Lista--");
			listaPrecios.remove(indice);

		} else {
			return;
		}*/
		
		//Eliminamos el objeto de la primera posicion con lambdas.
		if (longitud > 0 && indice < longitud) {
			
		listaPrecios.removeIf(obj-> obj == elemento);
		System.out.println("\n--Elemento " + elemento + " Eliminado de la Lista--");
		}
		else {return;}

		System.out.println("\n===========Lista Frutas=================");

		// foreach recorrido completo con lambdas

		listaPrecios.stream().forEach(System.out::println);

		// -------------------UPDATE----------------------------------

		double kiloZapallo = 230.00d;

		if (longitud > 0 && indice < longitud) {
			System.out.println(
					"\n--Elemento " + listaPrecios.get(indice) + " Actualizado en la Lista por " + kiloZapallo);

			listaPrecios.set(indice, kiloZapallo);

		} else {
			return;
		}
		
		
		System.out.println("\n===========Lista Frutas=================");

		// Podemos modificar la lambda
		System.out.println("\n INDICE | VALOR | TIPO");

		// Nos aseguramos que hayan elementos con el filter
		// Vamos a comparar todos los elementos creados, si
		// obtenemos -1 el elemento ya no existe en la Lista
		// El uso de lambdas es mas natural y sucinto con objetos

		listaPrecios.stream().filter(obj -> listaPrecios.size() >= 0)
				.forEach(objetoLista -> System.out.println(+listaPrecios.indexOf(kiloManzanas) + " | " + kiloManzanas
						+ " | Manzanas " + "\n" + listaPrecios.indexOf(kiloBananas) + " | " + kiloBananas
						+ " | Bananas " + "\n" + listaPrecios.indexOf(kiloPeras) + " | " + kiloPeras + " | Peras "
						+ "\n" + listaPrecios.indexOf(kiloZapallo) + " | " + kiloZapallo + " | Zapallo " + "\n"));

	}

}

