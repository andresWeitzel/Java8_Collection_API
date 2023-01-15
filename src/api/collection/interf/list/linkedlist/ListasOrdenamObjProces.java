package api.collection.interf.list.linkedlist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ListasOrdenamObjProces {
	
	public static void main(String[] args) {
		
		// https://www.mercadolibre.com.ar/ventilador-3-en-1-tower-t-253-negro-con-3-palas-color-plateado-de-metal-18-de-diametro-220v/p/MLA15956041?pdp_filters=category:MLA1645#searchVariation=MLA15956041&position=1&search_layout=grid&type=product&tracking_id=c3fadf19-4936-4f17-8193-887f917df758
		Ventilador towerT235 = new Ventilador(123131,"AHJF776YD","Tower","T-253"
				,"De Pared/Pie/Piso","Tower T-253"
				,"Ventilador 3 en 1 Tower T-253 negro con 3 palas color plateado de metal, 18\" de diámetro 220 V"
				,90, 7200, 200);
		
		//https://www.mercadolibre.com.ar/ventilador-de-piso-exahome-semi-industrial-negro-con-5-palas-20-de-diametro-220v/p/MLA15449599#reco_item_pos=9&reco_backend=machinalis-pdp-v2p&reco_backend_type=low_level&reco_client=pdp-v2p&reco_id=12af83b0-1a3a-497d-af33-736b09f0d8ee
		Ventilador exaSemi = new Ventilador(1231231,"ALKJSY22A","Exahome"
				,"Semi Industrial","De Piso","Ventilador de Piso Exahome","Ventilador de piso Exahome Semi Industrial negro con 5 palas, 20 pulgadas de diámetro 220 V"
				, 90 , 5659 , 400);
		
		//https://www.mercadolibre.com.ar/ventilador-de-techo-peabody-pe-vtr42-blanco-con-3-palas-color-transparente-de-acrilico-42-de-diametro-220v/p/MLA15700655#reco_item_pos=19&reco_backend=machinalis-pdp-v2p&reco_backend_type=low_level&reco_client=pdp-v2p&reco_id=d78d8fbd-a474-449a-a933-d35f1c7b4154
		Ventilador peVtr42 = new Ventilador(312312, "ADDSJ782JJ","Peabody","PE-VTR42"
				,"De Techo","Ventilador de Techo Peabody","Ventilador de techo Peabody PE-VTR42 blanco con 3 palas color transparente de acrílico, 42\" de diámetro 220 V"
				, 90 , 25499 , 500);
		
		//https://www.mercadolibre.com.ar/ventilador-de-techo-martin-martin-florencia-vt48-negro-con-4-palas-220v/p/MLA16267924#reco_item_pos=8&reco_backend=machinalis-pdp-v2p&reco_backend_type=low_level&reco_client=pdp-v2p&reco_id=c6c4397e-1c2d-4d61-a4ba-11575e3f75da
		Ventilador martinVt48 = new Ventilador(1231212, "TGDHHJKU86","Martin & Martin","Florencia VT48"
				,"De Techo", "Ventilador de Techo Florencia Vt48" ,"Ventilador de techo Martin & Martin Florencia VT48 negro con 4 palas 220 V"
				, 90 , 68736 , 120);
		
		//Creamos 4 objetos mas ficticios
		Ventilador martinVt51 = new Ventilador(1273645, "TGDHHJKU91","Martin & Martin","Carmelias AZ77"
				,"De Pie", "Ventilador de Techo Carmelias AZ77" ,"Ventilador de Pie Martin & Martin Carmelias AZ77 negro con 4 palas 220 V"
				, 100 , 67899 , 221);
		
		
		//https://www.mercadolibre.com.ar/ventilador-de-piso-exahome-semi-industrial-negro-con-5-palas-20-de-diametro-220v/p/MLA15449599#reco_item_pos=9&reco_backend=machinalis-pdp-v2p&reco_backend_type=low_level&reco_client=pdp-v2p&reco_id=12af83b0-1a3a-497d-af33-736b09f0d8ee
		Ventilador exaSemiPie = new Ventilador(211133,"AJSHAA77","Exahome"
				,"Semi Industrial","De Pie","Ventilador de Pie Exahome Edición 2021","Ventilador de pie Exahome Semi Industrial blanco con 6 palas, edición 2021 220 V"
				, 90 , 6859 , 100);
		
		List<Ventilador> listaVentiladores =  new LinkedList<>(Arrays.asList(towerT235,exaSemi,peVtr42
				, martinVt48, martinVt51, exaSemiPie));
		
		
		//En mi caso por preferencia y simplicidad de codigo voy a utilizar la interfaz
		//Comparator para Ordenamientos
		
		// ---------------------------------------------------------------------------

		System.out.println("\n--Orden Natural Creciente por ID--");
		
		listaVentiladores
			.stream()
			.sorted(Comparator.comparing(Ventilador::getId))
			.forEach(System.out::println);
		
	System.out.println("\n--Orden Natural Decreciente por ID--");
		
		listaVentiladores
			.stream()
			.sorted(Comparator.comparing(Ventilador::getId).reversed())
			.forEach(System.out::println);
		
		
		
		System.out.println("\n");
		System.out.println("\n--Orden Natural Creciente por ID según campos deseados--");
		listaVentiladores
		.stream()
		.sorted(Comparator.comparing(Ventilador::getId))
		.forEach(obj->System.out.println(
				"\nNro de Serie: "+obj.getNroSerie()
				+" | Marca : "+obj.getMarca()
				+" | Modelo: "+obj.getModelo()
				+" | Precio: "+obj.getPrecio()
				+" | Stock: "+obj.getStock()
				));
		
		System.out.println("\n");
		System.out.println("\n--Orden Natural Creciente por Nombre según campos deseados--");
		listaVentiladores
		.stream()
		.sorted(Comparator.comparing(Ventilador::getNombre))
		.forEach(obj->System.out.println(
				"\nNro de Serie: "+obj.getNroSerie()
				+" | Nombre : "+obj.getNombre()
				+" | Precio: "+obj.getPrecio()
				));
		
		System.out.println("\n");
		System.out.println("\n--Orden Natural Creciente por Nombre según campos deseados con LIMIT--");
		listaVentiladores
		.stream()
		.sorted(Comparator.comparing(Ventilador::getNombre))
		.limit(3)
		.forEach(obj->System.out.println(
				"\nNro de Serie: "+obj.getNroSerie()
				+" | Nombre : "+obj.getNombre()
				+" | Precio: "+obj.getPrecio()
				));
		// ---------------------------------------------------------------------------
		
		System.out.println("\n==========================================");
		System.out.println("== AGRUPAMIENTO ORDENADO POR MARCAS (FILTER)==");

		System.out.println("\n--Ventiladores Marca Tower--");
		
		listaVentiladores
		.stream()
		.filter(obj-> obj.getMarca() == "Tower")
		.sorted(Comparator.comparing(Ventilador::getId))
		.forEach(System.out::println);
	

		System.out.println("\n--Ventiladores Marca Exahome--");
		
		listaVentiladores
		.stream()
		//.filter(obj-> obj.getMarca() == "Exahome")
		.filter(obj-> obj.getMarca().equalsIgnoreCase("exahome"))
		.sorted(Comparator.comparing(Ventilador::getId))
		.forEach(System.out::println);
		
		System.out.println("\n--Ventiladores Marca Peabody--");
		
		listaVentiladores
		.stream()
		.filter(obj-> obj.getMarca().equalsIgnoreCase("peabody"))
		.sorted(Comparator.comparing(Ventilador::getId))
		.forEach(System.out::println);
		
		
		System.out.println("\n--Ventiladores Marca Martin & Martin--");
		
		listaVentiladores
		.stream()
		.filter(obj-> obj.getMarca().equalsIgnoreCase("martin & martin"))
		.sorted(Comparator.comparing(Ventilador::getId))
		.forEach(System.out::println);
	
		// ---------------------------------------------------------------------------
		System.out.println("\n==========================================");
		System.out.println("\n== AGRUPAMIENTO ORDENADO POR STOCK (FILTER) Y MODIFICACION(PEEK o MAP) ==");

		System.out.println("\n--Ventiladores cuyo Stock sea menor o igual a 100 modificando su precio--");
		
		//Recordemos que el .map conlleva un return, el .peek no
		listaVentiladores
		.stream()
		.filter(obj-> obj.getStock() <= 100)
		.peek(obj->obj.setPrecio(obj.getPrecio() + 1000))
		.sorted(Comparator.comparing(Ventilador::getId))
		.forEach(System.out::println);
		
		
		System.out.println("\n--Ventiladores cuyo Stock sea mayor a 100 modificando su precio--");
		
		listaVentiladores
		.stream()
		.filter(obj-> obj.getStock() > 100)
		.peek(obj->obj.setPrecio(obj.getPrecio() + 1000))
		.sorted(Comparator.comparing(Ventilador::getId))
		.forEach(System.out::println);
		
		
		System.out.println("\n--Ventiladores cuyo Stock sea mayor a 100 y cuya marca Tower modificando su precio--");
		
		listaVentiladores
		.stream()
		.filter(obj-> obj.getStock() > 100 && obj.getMarca().equalsIgnoreCase("tower"))
		.peek(obj->obj.setPrecio(obj.getPrecio() + 1000))
		.sorted(Comparator.comparing(Ventilador::getId))
		.forEach(System.out::println);
		
		System.out.println("\n--Ventiladores cuyo Stock sea mayor a 100 y cuya marca Tower modificando su precio (CAMPOS DESEADOS)--");
		
		listaVentiladores
		.stream()
		.filter(obj-> obj.getStock() > 100 && obj.getMarca().equalsIgnoreCase("tower"))
		.peek(obj->obj.setPrecio(obj.getPrecio() + 1000))
		.sorted(Comparator.comparing(Ventilador::getId))
		.forEach(obj->System.out.println(
		"\nNro de Serie: "+obj.getNroSerie()
		+" | Marca : "+obj.getMarca()
		+" | Modelo: "+obj.getModelo()
		+" | Precio: "+obj.getPrecio()
		+" | Stock: "+obj.getStock()
		));
		
		
	}

}

//Clasificacion de Ventiladores
//https://es.wikipedia.org/wiki/Ventilador

//caracteristicas mas comunes
//https://www.mercadolibre.com.ar/ventilador-3-en-1-tower-t-253-negro-con-3-palas-color-plateado-de-metal-18-de-diametro-220v/p/MLA15956041?pdp_filters=category:MLA1645#searchVariation=MLA15956041&position=1&search_layout=grid&type=product&tracking_id=c3fadf19-4936-4f17-8193-887f917df758

@Data
@NoArgsConstructor
@AllArgsConstructor
class Ventilador{
	
	long id;
	String nroSerie;
	String marca;
	String modelo;
	String tipoUso;//pared, mesa, pedestal, psio, techo, etc
	String nombre;
	String descripcion;
	int potencia;
	int precio;
	int stock;

}

