package week4.day15.exam._01_collection;

import java.util.ArrayList;

class StringArrayListMain {

	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<>();
		
		stringList.add("Apple");
		stringList.add("Banana");
		stringList.add("Pear");
		
		for (String string : stringList) {
			System.out.println(string);
		}

	}

}
