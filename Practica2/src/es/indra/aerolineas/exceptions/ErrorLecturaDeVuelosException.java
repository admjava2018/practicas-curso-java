/**
 * 
 */
package es.indra.aerolineas.exceptions;

/**
 * @author P.era-1
 *
 */
public class ErrorLecturaDeVuelosException extends Exception {
	
	public ErrorLecturaDeVuelosException(Throwable cause) {
		super(cause);
	}
	
	public ErrorLecturaDeVuelosException(String message) {
		super(message);
	}
	
	public ErrorLecturaDeVuelosException(String message, Throwable cause) {
		super(message,cause);
	}
}
