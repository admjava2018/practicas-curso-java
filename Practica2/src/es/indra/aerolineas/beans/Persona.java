/**
 * 
 */
package es.indra.aerolineas.beans;

/**
 * @author P.era-1
 *
 */
public class Persona {
	
	protected String nombre;
	private String apellido;
	private String dni;
	private int id;
	
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
	
	//Para pasajeros en mayúsculas.
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
}
