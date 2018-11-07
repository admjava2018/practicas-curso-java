import java.util.HashMap;
import java.util.Map;

/**
 * 
 */

/**
 * @author P.era-1
 *
 */
public class MapasDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<String, String> estudiantes = new HashMap<>();
		estudiantes.put("perez", "nombre");
		estudiantes.put("perez", "nombre");
		estudiantes.put("perez", "nombre");
		
		System.out.println(estudiantes.size());
		
		for(Map.Entry<String, String> elemento:estudiantes.entrySet()) {
			System.out.println("Clave: "
			+ elemento.getKey() + " y valor: " + elemento.getValue());
		}
	}
}
