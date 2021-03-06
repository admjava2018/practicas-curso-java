/**
 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author P.era-1
 *
 */
public abstract class Persona {
	
	protected String nombre;
	protected String apellido;
	protected String dni;
	private int id;
	
	public void datos(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//Para pasajeros en may�sculas.
	public String getNombre() {
		return nombre.toUpperCase();
	}
	
	public String getApellido() {
		return apellido.toUpperCase();
	}
	
	public String getDni() {
		return dni;
	}
	
	public int getId() {
		return id;
	}
	
	public abstract String solicitarInformacion();
}
