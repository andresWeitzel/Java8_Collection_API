package api.collection.interf.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ComparacionArrayListLinkedListCRUDMezclaString {
	
	/*
	 * 
	 *  ========== COMPROBACION DE CAMPO (ELEMENTOS ITERATIVOS,CONSECUTIVOS) ==========
	 * --ADD AND SELECT--
	 * ArrayList mas rapido
	 * 
	 * --UPDATE AND SELECT--
	 * ArrayList más rapido
	 * 
	 * --UPDATE SELECT AND DELETE--
	 * ArrayList más rápido
	 * 
	 *
	 * */
	public static void main(String[] args) {

		List<String> listaNumeros01 = new LinkedList<>();

		List<String> listaNumeros02 = new ArrayList<>();

		int numElementos = 100000;

		//=========================================================================
		//=========================================================================
		//=========================================================================
		// ========================= ADD AND SELECT========================

		System.out.println("\n============== ADD AND SELECT===================");

	

	
		System.out.println("\n-------------Lista Empleados LinkedList----------------");

		long inicio001 = System.nanoTime();

		for (int i = 0; i < numElementos; i++) {
			listaNumeros01.add("asd");
		}
		for (String s : listaNumeros01) {
		}
		long fin001 = System.nanoTime() - inicio001;

		System.out.println("Duración: " + fin001 + " nanoSeg / " + fin001 / 1000000 + " miliSeg");

		System.out.println("\n-------------Lista Empleados ArrayList----------------");

		long inicio002 = System.nanoTime();

		for (int i = 0; i < numElementos; i++) {
			listaNumeros02.add("asd");
		}
		for (String s : listaNumeros02) {
		}


		long fin002 = System.nanoTime() - inicio002;

		System.out.println("Duración: " + fin002 + " nanoSeg / " + fin002 / 1000000 + " miliSeg");

		
		

		//=========================================================================
		//=========================================================================
		//=========================================================================
		// ========================= UPDATE ADN SELECT========================
		System.out.println("\n\n");
		System.out.println("\n============== UPDATE AND SELECT===================");



		System.out.println("\n-------------Lista Empleados LinkedList----------------");

		long inicio003 = System.nanoTime();

		for(int i=0 ; i < numElementos; i++) {
			listaNumeros01.set(i, "123456qwert");
		}
		
		for (String s : listaNumeros01) {
		}
	
		long fin003 = System.nanoTime() - inicio003;

		System.out.println("Duración: " + fin003 + " nanoSeg / " + fin003 / 1000000 + " miliSeg");

		System.out.println("\n-------------Lista Empleados ArrayList----------------");

		long inicio004 = System.nanoTime();

		
		for(int i=0 ; i < numElementos; i++) {
			listaNumeros02.set(i, "123456qwert");
		}
		
		for (String s : listaNumeros02) {
		}
	
		long fin004 = System.nanoTime() - inicio004;

		System.out.println("Duración: " + fin004 + " nanoSeg / " + fin004 / 1000000 + " miliSeg");

		
		
		//=========================================================================
				//=========================================================================
				//=========================================================================
				// ========================= UPDATE SELECT AND DELETE ========================
				System.out.println("\n\n");
				System.out.println("\n============== UPDATE SELECT AND DELETE ===================");


				System.out.println("\n-------------Lista Empleados LinkedList----------------");

				long inicio007 = System.nanoTime();
				
				for(int i=0 ; i < numElementos; i++) {
					listaNumeros01.set(i, "123456qwert123456");
				}
				
				for (String s : listaNumeros01) {
				}

				for(int i=0 ; i < (numElementos -1); i++) {
					if(listaNumeros01.size() > i) {
						listaNumeros01.remove(i);
					}else {break;}
					
					
				}

				long fin007 = System.nanoTime() - inicio007;

				System.out.println("Duración: " + fin007 + " nanoSeg / " + fin007 / 1000000 + " miliSeg");

				System.out.println("\n-------------Lista Empleados ArrayList----------------");

				long inicio008 = System.nanoTime();

				for(int i=0 ; i < numElementos; i++) {
					listaNumeros02.set(i,"123456qwert123456");
				}
				
				for (String s : listaNumeros02) {
				}
				
				
				for(int i=0 ; i < (numElementos -1); i++) {
					if(listaNumeros02.size() > i) {
						listaNumeros02.remove(i);
					}else {break;}
					
				}


				long fin008 = System.nanoTime() - inicio008;

				System.out.println("Duración: " + fin008 + " nanoSeg / " + fin008 / 1000000 + " miliSeg");

	}

}
