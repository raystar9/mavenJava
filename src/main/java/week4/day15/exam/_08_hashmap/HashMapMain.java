package week4.day15.exam._08_hashmap;

import java.util.HashMap;

class HashMapMain {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("woman", "funny");
		map.put("man", "gentle");
		map.put("age", new Integer(29));
		map.put("city", "seoul");

		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.get("woman"));
		System.out.println(map.get("age"));
	}

}
