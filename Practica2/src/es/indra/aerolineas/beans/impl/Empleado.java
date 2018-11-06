/**
 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author P.era-1
 *
 */
public class Empleado extends Persona {
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	public Empleado() {
		
	}
	
	@Override
	public String solicitarInformacion() {
		return null;
	}
	
}
