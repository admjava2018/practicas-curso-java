import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author P.era-1
 *
 */
public class Limite<T> {

	/**
	 * @param args
	 */
	private T t;
	
	public T getLimite(){
		return t;
	}
	
	public void setLimite(T t) {
		this.t = t;
	}
	
	public void setT(T t) {
		this.t= t;
	}
	
	public T getT() {
		return t;
	}
	
	public <U extends Number> void revision(U u) {
		System.out.println("T es de tipo " + t.getClass().getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Limite<Integer> caja1 = new Limite<Integer>();
		caja1.setLimite(5);
		System.out.println(caja1.getLimite());
		
		Limite<Double> limD = new Limite<>();
		limD.setT(34d);
		System.out.println(limD.getT());
		limD.revision(35d);
		
		Limite<String> limString = new Limite<>();
		limString.setT("Hola");
		System.out.println(limString.getT());
		//limString.revision("Otro String");
		
	
		
	}

}
