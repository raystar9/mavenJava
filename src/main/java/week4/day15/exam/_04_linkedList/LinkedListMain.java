package week4.day15.exam._04_linkedList;

import java.util.Iterator;
import java.util.LinkedList;

class LinkedListMain {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
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
	static void printList(LinkedList<String> list) {
		System.out.println("===============================");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
