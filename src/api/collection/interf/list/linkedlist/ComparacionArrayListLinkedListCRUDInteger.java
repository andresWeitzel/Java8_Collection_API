package api.collection.interf.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ComparacionArrayListLinkedListCRUDInteger {
	
	/*
	 * 
	 * 
	 * 
	 * ==========ArrayList ============
	 * -Mejor para almacenar y Acceder a los Datos
	 * -Es un arreglo variable
	 * 
	 * 
	 * ==========LinkedList============
	 * -Mejor para manipular datos
	 * -lista doblemente vinculada
	 * 
	 * LinkedList tiene ventaja en ELEMENTOS NO CONSECUTIVOS
	 * ArrayList tiene ventaja en ELEMENTOS CONSECUTIVOS 
	 * 
	 * 
	 * 
	 * ========== COMPROBACION DE CAMPO (ELEMENTOS ITERATIVOS,CONSECUTIVOS) ==========
	 * --ADD--
	 * LinkedList mas rapido
	 * 
	 * --SELECT--
	 * ArrayList más rapido
	 * 
	 * --UPDATE--
	 * ArrayList más rápido
	 * 
	 * --DELETE--
	 * ArrayList es más rápido
	 * 
	 * 
	 * */

	public static void main(String[] args) {

		List<Integer> listaNumeros01 = new LinkedList<>();

		List<Integer> listaNumeros02 = new ArrayList<>();

		int numElementos = 100000;

		//=========================================================================
		//=========================================================================
		//=========================================================================
		// ========================= ADD ========================

		System.out.println("\n============== ADD ===================");

	

	
		System.out.println("\n-------------Lista Empleados LinkedList----------------");

		long inicio001 = System.nanoTime();

		for (int i = 0; i < numElementos; i++) {
			listaNumeros01.add(i);
		}
		long fin001 = System.nanoTime() - inicio001;

		System.out.println("Duración: " + fin001 + " nanoSeg / " + fin001 / 1000000 + " miliSeg");

		System.out.println("\n-------------Lista Empleados ArrayList----------------");

		long inicio002 = System.nanoTime();

		for (int i = 0; i < numElementos; i++) {
			listaNumeros02.add(i);
		}


		long fin002 = System.nanoTime() - inicio002;

		System.out.println("Duración: " + fin002 + " nanoSeg / " + fin002 / 1000000 + " miliSeg");

		
		

		//=========================================================================
		//=========================================================================
		//=========================================================================
		// ========================= SELECT========================
		System.out.println("\n\n");
		System.out.println("\n============== SELECT ===================");



		System.out.println("\n-------------Lista Empleados LinkedList----------------");

		long inicio003 = System.nanoTime();

		for (Integer i : listaNumeros01) {
		}
	
		long fin003 = System.nanoTime() - inicio003;

		System.out.println("Duración: " + fin003 + " nanoSeg / " + fin003 / 1000000 + " miliSeg");

		System.out.println("\n-------------Lista Empleados ArrayList----------------");

		long inicio004 = System.nanoTime();

		for (Integer i : listaNumeros02) {
		}
	
		long fin004 = System.nanoTime() - inicio004;

		System.out.println("Duración: " + fin004 + " nanoSeg / " + fin004 / 1000000 + " miliSeg");

		//=========================================================================
		//=========================================================================
		//=========================================================================
		// ========================= UPDATE ========================
		System.out.println("\n\n");
		System.out.println("\n============== UPDATE ===================");


		System.out.println("\n-------------Lista Empleados LinkedList----------------");

		long inicio005 = System.nanoTime();

		for(int i=0 ; i < numElementos; i++) {
			listaNumeros01.set(i, i++);
		}

		long fin005 = System.nanoTime() - inicio005;

		System.out.println("Duración: " + fin005 + " nanoSeg / " + fin005 / 1000000 + " miliSeg");

		System.out.println("\n-------------Lista Empleados ArrayList----------------");

		long inicio006 = System.nanoTime();

		for(int i=0 ; i < numElementos; i++) {
			listaNumeros02.set(i, i++);
		}


		long fin006 = System.nanoTime() - inicio006;

		System.out.println("Duración: " + fin006 + " nanoSeg / " + fin006 / 1000000 + " miliSeg");

		
		
		//=========================================================================
				//=========================================================================
				//=========================================================================
				// ========================= DELETE ========================
				System.out.println("\n\n");
				System.out.println("\n============== DELETE ===================");


				System.out.println("\n-------------Lista Empleados LinkedList----------------");

				long inicio007 = System.nanoTime();

				for(int i=0 ; i < (numElementos -1); i++) {
					if(listaNumeros01.size() > i) {
						listaNumeros01.remove(i);
					}else {break;}
					
					
				}

				long fin007 = System.nanoTime() - inicio007;

				System.out.println("Duración: " + fin007 + " nanoSeg / " + fin007 / 1000000 + " miliSeg");

				System.out.println("\n-------------Lista Empleados ArrayList----------------");

				long inicio008 = System.nanoTime();

				for(int i=0 ; i < (numElementos -1); i++) {
					if(listaNumeros02.size() > i) {
						listaNumeros02.remove(i);
					}else {break;}
					
				}


				long fin008 = System.nanoTime() - inicio008;

				System.out.println("Duración: " + fin008 + " nanoSeg / " + fin008 / 1000000 + " miliSeg");

	}

}
