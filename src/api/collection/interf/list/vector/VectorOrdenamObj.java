package api.collection.interf.list.vector;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
import java.util.Vector;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class VectorOrdenamObj {
	
	public static void main(String[] args) {
		
		Transaccion transac01 = new Transaccion(UUID.randomUUID(),23123133
				,123123125,20000,LocalDate.of(2022, 5, 12),LocalTime.of(22, 22));
		Transaccion transac02 = new Transaccion(UUID.randomUUID(),2212323
				,345435646,30000,LocalDate.of(2022, 5, 12),LocalTime.of(12, 4));
		Transaccion transac03 = new Transaccion(UUID.randomUUID(),6512313
				,657565655,40000,LocalDate.of(2022, 5, 12),LocalTime.of(9, 45));
		Transaccion transac04 = new Transaccion(UUID.randomUUID(),123123124
				,134534534,21000,LocalDate.of(2021, 6, 1),LocalTime.of(12, 34));
		Transaccion transac05 = new Transaccion(UUID.randomUUID(),62642346
				,456451211,2000,LocalDate.of(2022, 6, 1),LocalTime.of(8, 22));
		Transaccion transac06 = new Transaccion(UUID.randomUUID(),84556562
				,876786712,66000,LocalDate.of(2022, 6, 1),LocalTime.of(3, 22));
		Transaccion transac07 = new Transaccion(UUID.randomUUID(),45312127
				,564564545,128000,LocalDate.of(2022, 7, 7),LocalTime.of(2, 8));
		Transaccion transac08 = new Transaccion(UUID.randomUUID(),23431765
				,123412346,208000,LocalDate.of(2022, 7, 7),LocalTime.of(15, 9));
		Transaccion transac09 = new Transaccion(UUID.randomUUID(),654699111
				,567567565,123000,LocalDate.of(2022, 7, 18),LocalTime.of(17, 1));
		Transaccion transac10 = new Transaccion(UUID.randomUUID(),56457345
				,312423536,110000,LocalDate.of(2022, 7, 21),LocalTime.of(19, 2));
		
		
		Vector<Transaccion> vectorTransac = new Vector<>
		(Arrays.asList(transac01,transac02,transac03,transac04,transac05,transac06
				,transac07,transac08,transac09,transac10)); 
		
		
		// ---------------------------------------------------------------------------
		// ---------------------------------------------------------------------------
		// ---------------------------------------------------------------------------
		System.out.println("\n======== INTERFAZ COMPARATOR==============");


		// ---------------------------------------------------------------------------
		System.out.println("\n -- Implementación Interfaz Comparator para Ordenamientos --");

		System.out.println("\n--Orden Natural Creciente por ID--");
		
		vectorTransac.sort(Comparator.comparing(Transaccion::getId));

		vectorTransac.forEach(System.out::println);

		
		System.out.println("\n--Orden Natural Decreciente por ID--");

		vectorTransac.sort(Comparator.comparing(Transaccion::getId).reversed());

		vectorTransac.forEach(System.out::println);
		
		// ---------------------------------------------------------------------------
		
		System.out.println("\n -- Implementación Interfaz Comparator para Ordenamientos con una E.D Stream() --");

		System.out.println("\n--Orden Natural Creciente por MONTO de Transaccion--");
		vectorTransac
			.stream()
			.sorted(Comparator.comparing(Transaccion::getMonto))
			.forEach(System.out::println);
		
	
		System.out.println("\n--Orden Natural Decreciente por MONTO de Transaccion--");
		vectorTransac
			.stream()
			.sorted(Comparator.comparing(Transaccion::getMonto).reversed())
			.forEach(System.out::println);
		
		

		System.out.println("\n--Orden Natural Creciente por FECHA --");
		vectorTransac
			.stream()
			.sorted(Comparator.comparing(Transaccion::getFecha))
			.forEach(System.out::println);
		
	
		System.out.println("\n--Orden Natural Decreciente por FECHA --");
		vectorTransac
			.stream()
			.sorted(Comparator.comparing(Transaccion::getFecha).reversed())
			.forEach(System.out::println);

		
		// ---------------------------------------------------------------------------
	

		
		
	}

}


@Data
@AllArgsConstructor
@NoArgsConstructor
class Transaccion{
	
	UUID id;
	long idCliente;	
	long nroCuenta;
	double monto;
	LocalDate fecha;
	LocalTime hora;
}
