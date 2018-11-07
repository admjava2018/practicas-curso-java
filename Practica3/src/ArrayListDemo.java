import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author P.era-1
 *
 */
public class ArrayListDemo {
	
	public static List<Integer> cargaArrayList(){
		List<Integer> lista = new ArrayList<>();
		for(int i=0;i<100;i++) {
			lista.add(i*2);
		}
		return lista;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listaGenerada = cargaArrayList();
		System.out.println(listaGenerada.size());
		for(Integer elemento:listaGenerada) {
			System.out.println(elemento);
		}
		System.out.println(listaGenerada.get(0));
		if(listaGenerada.contains(50)) {
			System.out.println("Contiene elemento 50");
		}
		if(!listaGenerada.isEmpty()) {
			listaGenerada.clear();
		}
		System.out.println("Tamaño actual: " + listaGenerada.size());
	}

}
