package api.collection.interf.list.arraylist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ListasOrdenamObj {
	
	public static void main(String[] args) {
		
		Cliente cli01= new Cliente(1,31234343,"Rafael","Gutierrez",34,LocalDate.of(2020, 12, 12));
		Cliente cli02= new Cliente(2,44433433,"Marcos","Contreras",22,LocalDate.of(2019, 5, 22));
		Cliente cli03= new Cliente(3,87629374,"Lucas","Buchz",28,LocalDate.of(2022, 4, 14));
		Cliente cli04= new Cliente(4,87472322,"Martina","Martinez",31,LocalDate.of(2021, 3, 19));
		Cliente cli05= new Cliente(5,13453453,"Sofia","Gutierrez",34,LocalDate.of(2020, 2, 23));
		Cliente cli06= new Cliente(6,94736473,"Marta","Lenzth",45,LocalDate.of(2022, 1, 21));
		
		List<Cliente> listaCli = new ArrayList<>
		(Arrays.asList(cli01,cli02,cli03,cli04,cli05,cli06));
		
		// ---------------------------------------------------------------------------
		// ---------------------------------------------------------------------------
		// ---------------------------------------------------------------------------
		System.out.println("\n======== INTERFAZ COMPARATOR==============");

		//Para listas que sean objetos solamente es posible utilizar la interfaz
		//comparator 
		//Antes de Java 8 se tenia que declarar clases que implementen dicha interfaz
		//pero ahora podemos utilizar directamente con programacion funcional
		
		// ---------------------------------------------------------------------------
		System.out.println("\n -- Implementación Interfaz Comparator para Ordenamientos --");

		System.out.println("\n--Orden Natural Creciente por ID--");
		
		listaCli.sort(Comparator.comparing(Cliente::getId));

		listaCli.forEach(System.out::println);

		
		System.out.println("\n--Orden Natural Decreciente por ID--");

		listaCli.sort(Comparator.comparing(Cliente::getId).reversed());

		listaCli.forEach(System.out::println);
		
		// ---------------------------------------------------------------------------
		
		System.out.println("\n -- Implementación Interfaz Comparator para Ordenamientos con una E.D Stream() --");

		System.out.println("\n--Orden Natural Creciente por NOMBRE--");
		listaCli
			.stream()
			.sorted(Comparator.comparing(Cliente::getNombre))
			.forEach(System.out::println);
		
	
		System.out.println("\n--Orden Natural Decreciente por NOMBRE--");
		listaCli
			.stream()
			.sorted(Comparator.comparing(Cliente::getNombre).reversed())
			.forEach(System.out::println);
		
		

		System.out.println("\n--Orden Natural Creciente por FECHA DE INGRESO--");
		listaCli
			.stream()
			.sorted(Comparator.comparing(Cliente::getFechaIngreso))
			.forEach(System.out::println);
		
	
		System.out.println("\n--Orden Natural Decreciente por FECHA DE INGRESO--");
		listaCli
			.stream()
			.sorted(Comparator.comparing(Cliente::getFechaIngreso).reversed())
			.forEach(System.out::println);

		
		// ---------------------------------------------------------------------------
	
		
	}

}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Cliente {
	
	long id;
	long nroCliente;
	String nombre;
	String apellido;
	int edad;
	LocalDate fechaIngreso;
	
	
}
