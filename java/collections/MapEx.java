package collections;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
	public static void main(String[] args) {
		basics();
	}

	private static void basics() {
		Map productsMap = new HashMap();
		productsMap.put("P01", "Phone");
		productsMap.put(null, "Computer");
		productsMap.put(null, "Laptop");
		productsMap.put("", "TV");
		
		//print the hashmap
		System.out.println(productsMap);
		
		//get a particular element
		String product = (String)productsMap.get("P02");
		System.out.println(product);
		
		String product1 = (String)productsMap.get("P01");
		System.out.println(product1);
		
		boolean keyExists  = productsMap.containsKey("P01");
		System.out.println(keyExists);
		
		boolean valueExists  = productsMap.containsValue("TV");
		System.out.println(valueExists);
	}
}
