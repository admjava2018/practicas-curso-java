/**
 * 
 */
package es.indra.aerolineas.main;

import java.util.Scanner;

import es.indra.aerolineas.beans.IAerolinea;
import es.indra.aerolineas.beans.impl.Aerolinea;
import es.indra.aerolineas.beans.impl.Empleado;
import es.indra.aerolineas.beans.impl.Pasajero;
import es.indra.aerolineas.beans.impl.Vuelo;

/**
 * @author josejarizav
 *
 */
public class Venta implements IAerolinea{
	
	private static Vuelo[] creaVuelos() {
		Vuelo[] vuelos = new Vuelo[10];
		for (int i = 0; i < vuelos.length; i++) {	
			int a = (int) (Math.random()*10+1);
			vuelos[i] = new Vuelo(i,"SD" + a, "MAD","VLC", i * 10, true   );
		}
		return vuelos;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Vuelo[] vuelos = creaVuelos();
		
		System.out.println("Introduce tus datos personales");
		Scanner scan = new Scanner(System.in);
		Pasajero pasajero1 = new Pasajero();
		System.out.println(pasajero1.getNombre());
		Aerolinea aa = new Aerolinea(10, "American Airlines",vuelos);
		
		aa.consultarVuelos("Madrid");
		aa.consultarVuelos("Madrid", "Nueva York");
		aa.consultarVuelo();
		
		Pasajero p = new Pasajero();
		
		Empleado emp = new Empleado();
		emp.setNombre("Empleado 1");
		
		Vuelo[] vuelosPasajero = {vuelos[0], vuelos[4]};
		
		p.setId(10);
		p.setNombre("Jose Julian");
		p.setApellido("Ariza Valderrama");
		p.setVuelos(vuelosPasajero);
		
		System.out.println("*************************************************************************");
		
		System.out.println("|\tBienvenidos a aerolineas ".concat(aa.getNombre()));
		
		System.out.println("|\tLe atiende ".concat(emp.getNombre()));
		
		System.out.printf("|\tTenemos %s vuelos disponibles%n",p.getVuelos().length);
		
		System.out.printf("|\t%s, gracias por confiar en nosotros. Tienes %s vuelos comprados %n", p.getNombre(),p.getVuelos().length );
		
		System.out.println("*************************************************************************");
		

	}
	
	

	@Override
	public void anularVuelos(String... vuelos) {
		// TODO Auto-generated method stub
		
	}

}
