/**
 * 
 */

/**
 * @author P.era-1
 *
 */
public class OrderedPair<K,V> implements Pair<K,V> {
	
	private K key;
	private V value;
	
	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderedPair<Integer,String> p1 = new OrderedPair<>(1,"rojo"); 
		System.out.println(p1.getKey()+" "+p1.getValue());
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}

}
