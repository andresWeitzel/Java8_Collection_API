package api.collection.interf.list.vector;

import java.util.Arrays;
import java.util.Vector;



/*
 * 
 * - Se usa para programacion concurrente concurrentes(threads, multithreading,
 * etc)
 * http://grasia.fdi.ucm.es/jpavon/docencia/dso/programacionconcurrentejava.pdf
 * 
 * - Es un tipo de E.D similar a un array(matriz), con tama�o din�mico en tiempo
 * de ejec. .
 * 
 * 
 * Los metodos diferentes en cuanto al resto de clases de la interfaz son:
 * 
 * 
 * -addElement (Agrega el componente especificado al final de este vector,
 * aumentando su tama�o en uno.)
 * 
 * -capacity (Devuelve la capacidad actual de este vector.)
 * 
 * -copyInto (Copia los componentes de este vector en la matriz especificada.)
 * 
 * -elements(Devuelve una enumeraci�n de los componentes de este vector)
 * 
 * -firstElement(Devuelve el primer componente (el elemento en el �ndice) de
 * este vector.0 )
 * 
 * -lastElement(idem up)
 * 
 * -insertElementAt (Inserta el objeto especificado como componente en este
 * vector en el archivo .index
 * 
 * -trimToSize (Recorta la capacidad de este vector para que sea el tama�o
 * actual del vector. ) 
 * 
 * -removeRange (Elimina de esta lista todos los elementos
 * cuyo �ndice est� entre , inclusive y , exclusivo.fromIndextoIndex
 * 
 * ) -subList (Devuelve una vista de la parte de esta lista entre fromIndex,
 * inclusive, y toIndex, exclusive. )
 * 
 * -etc....
 * 
 * ) -doc oracle :
 * https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html
 */

public class MatrizVectorString {

	

	public static void main(String[] args) {

		Vector<String> vectorElementos = new Vector<String>();

		vectorElementos.addAll(Arrays.asList(
				"Marcos Augusto"
				, "Antonio Perez"
				, "Micaela Castro"
				, "Marcos Gutierrez"
				));

		/*
		for (String e : vectorElementos) {
			System.out.println(e);
		}
		*/
		
		System.out.println("\n === Elementos del Vector Din�mico ===");
		vectorElementos.forEach(System.out::println);
		

		System.out.println("\n === Tama�o del Vector Din�mico ===");
		System.out.println(vectorElementos.size());
		
		
		System.out.println("\n === Capacidad del Vector Din�mico ===");
		System.out.println(vectorElementos.capacity());
		
		
		
		System.out.println("\n === Primer Elemento del Vector Din�mico ===");
		System.out.println(vectorElementos.firstElement());
		
		System.out.println("\n === Ultimo Elemento del Vector Din�mico ===");
		System.out.println(vectorElementos.lastElement());
		
		System.out.println("\n === Agregamos un Elemento al Vector Din�mico ===");
		vectorElementos.addElement("Julieta Bustamante");
		
		System.out.println("\n === Ultimo Elemento del Vector Din�mico ===");
		System.out.println(vectorElementos.lastElement());
		
		
		System.out.println("\n === Recortamos el Vector Din�mico en una sublista ===");
		System.out.println(vectorElementos.subList(0, 2));
		
		
		

	}

}
