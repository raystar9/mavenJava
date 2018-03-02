package week4.day15.exam._05_vector;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

class VectorMain {

	public static void main(String[] args) {
		Vector<String> list = new Vector<>();
		
		list.add("Grape");
		list.add("Strawberry");
		list.add("Peach");
		list.add(2, "kiwi");
		printList(list);
		list.set(0, "Orange");
		
		printList(list);
		list.remove(1);
		list.remove("kiwi");
		
		printList(list);
		
	}
	static void printList(Vector<String> list) {
		System.out.println("===============================");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
