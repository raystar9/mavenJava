package week4.day15.exam._09_treeMap;

import java.util.Map;
import java.util.TreeMap;

class TreeMapMain {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		
		map.put("woman", "funny");
		map.put("man", "gentle");
		map.put("age", "29");
		map.put("city", "seoul");

		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.get("woman"));
		System.out.println(map.get("age"));
	}

}
