/**
 * 
 */
package es.indra.aerolineas.services;

import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author P.era-1
 *
 */
public class ReadFile {
	
	public void retornarVuelos() {
		Path path = Paths.get("C:\\Users\\P.era-1\\repositorios\\practicas-curso-java\\vuelos.txt");
		try {
			List<String> contenido =  Files.readAllLines(path);
			System.out.println("");
			System.out.println("Vuelos disponibles: ");
			for(String a:contenido) {
				System.out.println("\t" + a);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
