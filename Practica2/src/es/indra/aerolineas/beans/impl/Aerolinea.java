/**
 * 
 */
package es.indra.aerolineas.beans.impl;

import es.indra.aerolineas.beans.IAerolinea;
import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;
import es.indra.aerolineas.services.ReadFile;

/**
 * @author josejarizav
 *
 *
 */
public class Aerolinea implements IAerolinea {
	
	private int id;
	private String nombre;
	private Vuelo[] vuelos = new Vuelo[10];
	
	public Aerolinea() {		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param vuelos
	 */
	public Aerolinea(int id, String nombre, Vuelo[] vuelos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vuelos = vuelos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vuelo[] getVuelos() {
		return vuelos;
	}

	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}

	public void consultarVuelos(String origen) {
		System.out.println("M�todo de 1 par�metro: ".concat(origen));
	}
	
	public void consultarVuelos(String origen, String destino) {
		System.out.printf("M�todo de 2 par�metros: %s y %s %n ", origen, destino);
	}
	
	public void consultarVuelo() {
		ReadFile r = new ReadFile();
		try {
			r.retornarVuelos();
		} catch (ErrorLecturaDeVuelosException e) {
			e.printStackTrace();
		}
	}
	
	public void anularVuelos(String... vuelos) {
		
	}
}
