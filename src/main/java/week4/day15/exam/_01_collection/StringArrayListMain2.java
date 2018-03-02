package week4.day15.exam._01_collection;

import java.util.ArrayList;

class StringArrayListMain2 {

	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<String>();
		
		stringList.add("Grape");
		stringList.add("Strawberry");
		stringList.add("Peach");
		stringList.add("Pear");
		stringList.add("Peach");
		stringList.add("Apple");
		
		printList(stringList);
		
		System.out.println(stringList.indexOf("Peach"));
		System.out.println(stringList.lastIndexOf("Peach"));

	}
	
	static void printList(ArrayList<String> list) {
		System.out.println("===============================");
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("Index = %d,\tData = %s\n", i, list.get(i));
		}
	
	}

}
