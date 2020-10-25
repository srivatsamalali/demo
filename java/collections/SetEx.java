package collections;

import java.util.HashSet;

public class SetEx {
	public static void main(String[] args) {
		// float salaries[] = {501.5f,502.5f,503.5f,504.5f,505.5f};
		HashSet set = new HashSet();
		set.add(501.5f);
		set.add(505.5f);
		set.add(null);
		set.add(501.5f);
		set.add(501.5f);
		set.add(502.5f);
		set.add(503.5f);
		set.add(null);
		System.out.println(set);
		set.remove(501.5f);
		System.out.println(set);
		set.clear();
		System.out.println(set);				
	}
}
